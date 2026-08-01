package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؘٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9555e {
    public final /* synthetic */ int ad;
    public final int metrica;
    public final int vip;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC9555e(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.ad = 1;
    }

    public /* synthetic */ AbstractC9555e(int i, int i2, int i3, byte b) {
        this.ad = i3;
        this.vip = i;
        this.metrica = i2;
    }

    public static C11853e ad(AbstractC9555e abstractC9555e, InterfaceC2102e[] interfaceC2102eArr) {
        return new C11853e(abstractC9555e.vip + abstractC9555e.metrica, interfaceC2102eArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؘٚ, eؙٔۛ] */
    public static C6405e metrica() {
        return new AbstractC9555e(0, 1, 0, (byte) 0);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [eٍؘٚ, eؙٔۛ] */
    public static C6405e vip(AbstractC9555e abstractC9555e) {
        return new AbstractC9555e(abstractC9555e.vip + abstractC9555e.metrica, 1, 0, (byte) 0);
    }

    public abstract Object appmetrica(int i);

    public abstract void license(C11226e c11226e, InterfaceC11305e interfaceC11305e, C14479e c14479e, C14995e c14995e, InterfaceC15989e interfaceC15989e);

    public C3155e purchase(C11226e c11226e) {
        return null;
    }

    public String toString() {
        switch (this.ad) {
            case 1:
                String mopub = AbstractC3820e.ad.vip(getClass()).mopub();
                return mopub == null ? BuildConfig.FLAVOR : mopub;
            default:
                return super.toString();
        }
    }
}
