package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class p implements k {
    public static final p AH;
    public static final /* synthetic */ p[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.chrono.p, java.lang.Enum] */
    static {
        ?? r0 = new Enum("AH", 0);
        AH = r0;
        a = new p[]{r0};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) a.clone();
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
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.o(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return temporalField == ChronoField.ERA ? j$.time.temporal.s.f(1L, 1L) : j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(1, ChronoField.ERA);
    }
}
