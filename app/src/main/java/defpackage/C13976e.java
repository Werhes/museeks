package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13976e extends C14573e {
    public int mopub;

    @Override // defpackage.C14573e
    /* renamed from: throw */
    public void mo3234throw(long[] jArr) {
        long[] jArr2 = this.adcel;
        if (jArr2 != null) {
            if (jArr != null) {
                Csuper csuper = new Csuper((byte) 0, 16);
                csuper.purchase(jArr2);
                csuper.purchase(jArr);
                long[] jArr3 = (long[]) csuper.f36471e;
                jArr2 = new long[csuper.m4658transient()];
                csuper.m4646instanceof(jArr3, jArr2);
            }
            jArr = jArr2;
        }
        int m200try = this.appmetrica.m200try(jArr, 159, 128, "array");
        if (m200try >= 0) {
            this.billing = true;
            this.purchase = m200try;
        }
    }

    @Override // defpackage.C14573e, defpackage.InterfaceC2043e
    public final int yandex(InterfaceC9998e interfaceC9998e) {
        boolean z = this.billing;
        if (!z && this.appmetrica.f1117e == 255) {
            return -1;
        }
        if (z && this.mopub >= this.purchase) {
            return -1;
        }
        int i = this.mopub;
        this.mopub = i + 1;
        this.startapp = AbstractC12797e.inmobi(interfaceC9998e, i);
        return i;
    }
}
