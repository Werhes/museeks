package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum h implements q {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.j(31556952L, 0);
        Duration.j(7889238L, 0);
    }

    h(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.q
    public final l i(l lVar, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            return lVar.c(j$.com.android.tools.r8.a.R(lVar.i(r0), j), i.c);
        }
        if (i == 2) {
            return lVar.d(j / 4, a.YEARS).d((j % 4) * 3, a.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
