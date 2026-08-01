package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b0 implements k {
    public static final b0 BEFORE_ROC;
    public static final b0 ROC;
    public static final /* synthetic */ b0[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.chrono.b0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.time.chrono.b0] */
    static {
        ?? r0 = new Enum("BEFORE_ROC", 0);
        BEFORE_ROC = r0;
        ?? r1 = new Enum("ROC", 1);
        ROC = r1;
        a = new b0[]{r0, r1};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) a.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long B(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.q(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.y(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.t(this, temporalField);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.o(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), ChronoField.ERA);
    }
}
