package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10129e implements InterfaceC7137e {
    public static final C2915e metrica = new AbstractC10129e(new C10836e(false, false, false, false, false, false, false, false, false), AbstractC16398e.ad);
    public final C10836e ad;
    public final C10068e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؚۘ, eؔۡؐ] */
    static {
        AbstractC7890e.ad(new C10310e(1));
    }

    public AbstractC10129e(C10836e c10836e, C10068e c10068e) {
        this.ad = c10836e;
        this.vip = c10068e;
    }

    @Override // defpackage.InterfaceC13417e
    public final C10068e ad() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC7137e
    public final byte[] metrica(InterfaceC5372e interfaceC5372e, Object obj) {
        C17041e c17041e = new C17041e();
        (this.ad.yandex ? new C14325e(this, c17041e) : new AbstractC17767e(this, c17041e)).appmetrica(interfaceC5372e, obj);
        int i = c17041e.vip;
        byte[] bArr = new byte[i];
        AbstractC1660e.admob(c17041e.ad, 0, 0, bArr, i, 2);
        return bArr;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖٗٓ, java.lang.Object] */
    @Override // defpackage.InterfaceC7137e
    public final Object vip(InterfaceC5372e interfaceC5372e, byte[] bArr) {
        ?? obj = new Object();
        obj.ad = bArr;
        return new C14573e(this, new crashlytics((C17041e) obj, this.ad.billing)).billing(interfaceC5372e);
    }
}
