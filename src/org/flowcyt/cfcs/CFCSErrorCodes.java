package org.flowcyt.cfcs;
// CFCSErrorCodes.java

/* ------------------------------------------------------------------------- *\
This software and documentation are provided 'as is' and Tree Star, Inc., its
contractors and partners specifically disclaim all other warranties, expressed
or implied, including but not limited to implied warranties of merchantability
and fitness for a particular purpose, or during any particular date range.

By using this software, you are agreeing to these limits of liability, and to
hold Tree Star harmless for any information, accurate or erroneous, that might
be generated by the program.  This software is intended for research use only.

Christopher Lane <cdl@best.classes> for Tree Star  1/14/2002      Copyright 2002
\* ------------------------------------------------------------------------- */

public interface CFCSErrorCodes
{

    public static final int CFCSNoSuchBin = -36;
    public static final int CFCSInsufficientSpace = -35;
    public static final int CFCSInsufficientData = -34;
    public static final int CFCSNotImplemented = -33;
    public static final int CFCSCannotModifySource = -32;
    public static final int CFCSIllegalName = -31;
    /* ... */
    public static final int CFCSKeywordUndefined = -30;
    public static final int CFCSNoSuchDataSet = -29;
    public static final int CFCSBadSourceSet = -28;
    public static final int CFCSParametersUndefined = -27;
    /* ... */
    public static final int CFCSParameterInclassesplete = -24;
    public static final int CFCSInconsistentAttribute = -23;
    public static final int CFCSCannotModifyValue = -22;
    public static final int CFCSInconsistentValue = -21;
    public static final int CFCSIllegalValue = -20;
    public static final int CFCSBadValueConversion = -19;
    public static final int CFCSBadKeywordIndex = -18;
    public static final int CFCSKeywordExists = -17;
    public static final int CFCSKeywordNotFound = -16;
    public static final int CFCSIllegalSegment = -15;
    public static final int CFCSIOError = -14;
    public static final int CFCSStreamNotOpen = -13;
    public static final int CFCSBadFCS = -12;
    /* ... */
    public static final int CFCSSystemError = -10;
    /* ... */
    public static final int CFCSNoSuchParameter = -8;
    public static final int CFCSNoSuchEvent = -7;
    /* ... */
    public static final int CFCSFileNotCreated = -5;
    public static final int CFCSVersionNotSupported = -4;
    public static final int CFCSFileNotFCS = -3;
    public static final int CFCSFileNotFound = -2;
    public static final int CFCSStreamAlreadyOpen = -1;

    public static final int CFCSSuccess = 0;

    public static final int CFCSNotFCSclassespliant = 1;
    public static final int CFCSNetworkIOError = 2;
    public static final int CFCSSegmentNotPresent = 3;
    public static final int CFCSKeywordModified = 4;
    public static final int CFCSOutOfRange = 5;
    public static final int CFCSHistogramOutOfRange = 6;
    /* ... */
    public static final int CFCSUndefinedAttribute = 7;
}