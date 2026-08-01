package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15389e {
    public static final float[] ad = new float[91];

    public static final int ad(long j, long[] jArr) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static Cursor appmetrica(WorkDatabase_Impl workDatabase_Impl, C6096e c6096e) {
        Cursor billing = workDatabase_Impl.billing(c6096e);
        if (billing instanceof AbstractWindowedCursor) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) billing;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i = 0; i < abstractWindowedCursor.getColumnCount(); i++) {
                            int type = abstractWindowedCursor.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(abstractWindowedCursor.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(abstractWindowedCursor.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = abstractWindowedCursor.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = abstractWindowedCursor.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    abstractWindowedCursor.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    abstractWindowedCursor.close();
                    throw th;
                }
            }
        }
        return billing;
    }

    public static final InterfaceC12864e billing(Function2 function2) {
        return new C3914e(function2);
    }

    public static long license(long j, long j2) {
        AbstractC5400e.ad(j, "a");
        AbstractC5400e.ad(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001f. Please report as an issue. */
    public static long metrica(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (AbstractC10963e.ad[roundingMode.ordinal()]) {
            case 1:
                AbstractC5400e.vip(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + i;
            case 4:
                return j3 + i;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + i;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                long abs2 = abs - (Math.abs(j2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (abs2 <= 0) {
                    return j3;
                }
                return j3 + i;
            default:
                throw new AssertionError();
        }
    }

    public static long purchase(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static long vip(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(AbstractC5087e.m1750native(j2, ")", AbstractC1786e.inmobi(j, "overflow: checkedAdd(", ", ")));
    }
}
