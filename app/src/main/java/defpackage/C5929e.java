package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘ۟ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5929e extends AbstractC16997e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public boolean f12502e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final Map f12503e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f12504e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final Function0 f12505e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f12506e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final Function1 f12507e;

    public C5929e(String str, Map map, Function0 function0, Function1 function1) {
        super(false, 3);
        this.f12503e = map;
        this.f12505e = function0;
        this.f12507e = function1;
        this.f12504e = AbstractC14533e.startapp(str);
        this.f12506e = AbstractC14533e.startapp(BuildConfig.FLAVOR);
    }

    @Override // defpackage.AbstractC5004e
    public final void amazon() {
        super.amazon();
        if (this.f12502e) {
            return;
        }
        this.f12505e.invoke();
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-692447896);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                C6260e c6260e = C6260e.vip;
                m3681throw = C11080e.ad;
                c13770e.m3682throws(m3681throw);
            }
            ((C11080e) m3681throw).getClass();
            C6260e c6260e2 = new C6260e();
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(200869421, new C1743e(this, c6260e2, i3), c13770e), c13770e, 12582912, 127);
            Unit unit = Unit.INSTANCE;
            boolean purchase = c13770e.purchase(c6260e2);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == c5170e) {
                m3681throw2 = new C9042e(c6260e2, null, 7);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw2);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11213e(this, i, 9);
        }
    }
}
