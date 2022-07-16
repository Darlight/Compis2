import sys


class grammarYAPLCustomErrorListener(object):

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        print('Syntax Error at Line ' + str(line) + ': ' + msg)

    def reportAmbiguity(self, recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs):
        print('Ambiguity... what were you trying to do you loco.')

    def reportAttemptingFullContext(self, recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs):
        print('Im trying but what the hell were you trying to do')

    def reportContextSensitivity(self, recognizer, dfa, startIndex, stopIndex, prediction, configs):
        print('Sensitivity')