package defpackage;

import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16050e extends AbstractC8112e {
    public final /* synthetic */ int appmetrica;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16050e(AbstractC9166e abstractC9166e, int i) {
        super(abstractC9166e);
        this.appmetrica = i;
    }

    @Override // defpackage.AbstractC8112e
    public final boolean ad(C13394e c13394e) {
        switch (this.appmetrica) {
            case 0:
                return c13394e.adcel.vip;
            case 1:
                return c13394e.adcel.license;
            case 2:
                return c13394e.adcel.ad == 2;
            case 3:
                int i = c13394e.adcel.ad;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return c13394e.adcel.appmetrica;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // defpackage.AbstractC8112e
    public final boolean vip(Object obj) {
        boolean booleanValue;
        switch (this.appmetrica) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
            case 2:
                C11584e c11584e = (C11584e) obj;
                return Build.VERSION.SDK_INT >= 26 ? (c11584e.ad && c11584e.vip) ? false : true : true ^ c11584e.ad;
            case 3:
                C11584e c11584e2 = (C11584e) obj;
                return !c11584e2.ad || c11584e2.metrica;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                return !booleanValue;
        }
    }
}
