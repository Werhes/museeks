package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10304e implements InterfaceC10545e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C11883e f20352e = new C11883e(new C17706e(20), new C3114e(26), 15);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public InterfaceC5039e f20353e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0583e f20354e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C13749e f20355e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Map f20356e;

    public C10304e(Map map) {
        this.f20356e = map;
        long[] jArr = AbstractC12981e.ad;
        this.f20354e = new C0583e();
        this.f20355e = new C13749e(16, this);
    }

    @Override // defpackage.InterfaceC10545e
    public final void ad(Object obj, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(533563200);
        if ((i & 6) == 0) {
            i2 = (c13770e.yandex(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(c2892e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i3 = 0;
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            c13770e.m3683transient(obj);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                C13749e c13749e = this.f20355e;
                if (!((Boolean) c13749e.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f20356e.get(obj);
                C15492e c15492e = AbstractC5991e.ad;
                C15298e c15298e = new C15298e(new C16537e(map, c13749e));
                c13770e.m3682throws(c15298e);
                m3681throw = c15298e;
            }
            C15298e c15298e2 = (C15298e) m3681throw;
            AbstractC1101e.vip(new C14815e[]{AbstractC5991e.ad.ad(c15298e2), AbstractC3666e.ad.ad(c15298e2)}, c2892e, c13770e, (i2 & 112) | 8);
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this) | c13770e.yandex(obj) | c13770e.yandex(c15298e2);
            Object m3681throw2 = c13770e.m3681throw();
            if (yandex || m3681throw2 == c5170e) {
                m3681throw2 = new C9675e(i3, this, obj, c15298e2);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.vip(unit, (Function1) m3681throw2, c13770e);
            if (c13770e.isPro && c13770e.f27293interface.startapp == c13770e.applovin) {
                c13770e.applovin = -1;
                c13770e.isPro = false;
            }
            c13770e.Signature(false);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 19, this, obj, c2892e);
        }
    }

    @Override // defpackage.InterfaceC10545e
    public final void vip(Object obj) {
        if (this.f20354e.advert(obj) == null) {
            this.f20356e.remove(obj);
        }
    }
}
