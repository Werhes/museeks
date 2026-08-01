package j$.time.temporal;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.m
    public final l n(l lVar) {
        switch (this.a) {
            case 0:
                int i = lVar.i(ChronoField.DAY_OF_WEEK);
                int i2 = this.b;
                if (i == i2) {
                    return lVar;
                }
                return lVar.d(i - i2 >= 0 ? 7 - r0 : -r0, a.DAYS);
            default:
                int i3 = lVar.i(ChronoField.DAY_OF_WEEK);
                int i4 = this.b;
                if (i3 == i4) {
                    return lVar;
                }
                return lVar.x(i4 - i3 >= 0 ? 7 - r1 : -r1, a.DAYS);
        }
    }
}
