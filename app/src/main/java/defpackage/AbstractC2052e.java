package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2052e implements InterfaceC4024e {
    public final C5963e ad;
    public final int license;
    public final Integer metrica;
    public final int vip;

    public AbstractC2052e(C5963e c5963e, int i, Integer num) {
        this.ad = c5963e;
        this.vip = i;
        this.metrica = num;
        int i2 = c5963e.appmetrica;
        this.license = i2;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("The minimum number of digits (", i, ") is negative").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّٓۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eّٓۥ, java.lang.Object] */
    @Override // defpackage.InterfaceC4024e
    public final C12469e ad() {
        C17681e c17681e = this.ad.ad;
        ?? obj = new Object();
        int i = this.vip;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1634e.smaato("The minimum number of digits (", i, ") is negative").toString());
        }
        if (i <= 9) {
            return this.metrica != null ? new Object() : obj;
        }
        throw new IllegalArgumentException(AbstractC1634e.smaato("The minimum number of digits (", i, ") exceeds the length of an Int").toString());
    }

    @Override // defpackage.InterfaceC4024e
    public final /* bridge */ /* synthetic */ AbstractC17230e metrica() {
        return this.ad;
    }

    @Override // defpackage.InterfaceC4024e
    public final C6195e vip() {
        Integer valueOf = Integer.valueOf(this.vip);
        Integer valueOf2 = Integer.valueOf(this.license);
        C5963e c5963e = this.ad;
        return AbstractC11575e.license(valueOf, valueOf2, this.metrica, c5963e.ad, c5963e.vip, false);
    }
}
