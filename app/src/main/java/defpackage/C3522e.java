package defpackage;

/* renamed from: eؕٞ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3522e {
    public static final /* synthetic */ int metrica = 0;
    public boolean ad;
    public Cprotected vip;

    static {
        new Ctry("2.5.29.9");
        new Ctry("2.5.29.14");
        new Ctry("2.5.29.15");
        new Ctry("2.5.29.16");
        new Ctry("2.5.29.17");
        new Ctry("2.5.29.18");
        new Ctry("2.5.29.19");
        new Ctry("2.5.29.20");
        new Ctry("2.5.29.21");
        new Ctry("2.5.29.23");
        new Ctry("2.5.29.24");
        new Ctry("2.5.29.27");
        new Ctry("2.5.29.28");
        new Ctry("2.5.29.29");
        new Ctry("2.5.29.30");
        new Ctry("2.5.29.31");
        new Ctry("2.5.29.32");
        new Ctry("2.5.29.33");
        new Ctry("2.5.29.35");
        new Ctry("2.5.29.36");
        new Ctry("2.5.29.37");
        new Ctry("2.5.29.46");
        new Ctry("2.5.29.54");
        new Ctry("1.3.6.1.5.5.7.1.1");
        new Ctry("1.3.6.1.5.5.7.1.11");
        new Ctry("1.3.6.1.5.5.7.1.12");
        new Ctry("1.3.6.1.5.5.7.1.2");
        new Ctry("1.3.6.1.5.5.7.1.3");
        new Ctry("1.3.6.1.5.5.7.1.4");
        new Ctry("2.5.29.56");
        new Ctry("2.5.29.55");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3522e)) {
            return false;
        }
        C3522e c3522e = (C3522e) obj;
        return c3522e.vip.isVip(this.vip) && c3522e.ad == this.ad;
    }

    public final int hashCode() {
        Cprotected cprotected = this.vip;
        return this.ad ? AbstractC12442e.isVip(cprotected.f36449e) : ~AbstractC12442e.isVip(cprotected.f36449e);
    }
}
