package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6017e implements InterfaceC5039e, InterfaceC10545e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C12618e f12672e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC10545e f12673e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C16537e f12674e;

    public C6017e(InterfaceC5039e interfaceC5039e, Map map, InterfaceC10545e interfaceC10545e) {
        C2109e c2109e = new C2109e(25, interfaceC5039e);
        C15492e c15492e = AbstractC5991e.ad;
        this.f12674e = new C16537e(map, c2109e);
        this.f12673e = interfaceC10545e;
        C12618e c12618e = AbstractC1710e.ad;
        this.f12672e = new C12618e();
    }

    @Override // defpackage.InterfaceC10545e
    public final void ad(Object obj, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-858296452);
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
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            this.f12673e.ad(obj, c2892e, c13770e, i2 & 126);
            boolean yandex = c13770e.yandex(this) | c13770e.yandex(obj);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C9041e(this, obj, 27);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.vip(obj, (Function1) m3681throw, c13770e);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 17, this, obj, c2892e);
        }
    }

    @Override // defpackage.InterfaceC5039e
    public final Object appmetrica(String str) {
        return this.f12674e.appmetrica(str);
    }

    @Override // defpackage.InterfaceC5039e
    public final Map license() {
        C12618e c12618e = this.f12672e;
        Object[] objArr = c12618e.vip;
        long[] jArr = c12618e.ad;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.f12673e.vip(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return this.f12674e.license();
    }

    @Override // defpackage.InterfaceC5039e
    public final boolean metrica(Object obj) {
        return this.f12674e.metrica(obj);
    }

    @Override // defpackage.InterfaceC5039e
    public final InterfaceC10153e purchase(String str, Function0 function0) {
        return this.f12674e.purchase(str, function0);
    }

    @Override // defpackage.InterfaceC10545e
    public final void vip(Object obj) {
        this.f12673e.vip(obj);
    }
}
