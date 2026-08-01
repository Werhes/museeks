package defpackage;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12340e extends AbstractC16997e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final /* synthetic */ int f24732e = 0;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final String f24733e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C0576e f24734e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C11952e f24735e;

    public C12340e(String str, Map map) {
        super(false, 3);
        this.f24733e = str;
        this.f24734e = AbstractC14533e.startapp(C0980e.ad);
        C11952e c11952e = new C11952e();
        c11952e.putAll(map);
        this.f24735e = c11952e;
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-1654529144);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            int startapp = AbstractC4533e.startapp(0.0f, c13770e, 0, 1);
            Unit unit = Unit.INSTANCE;
            boolean yandex = c13770e.yandex(this);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C7914e(this, (InterfaceC5083e) null, 5);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17680e.license(c13770e, unit, (Function2) m3681throw);
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(2046563661, new C13752e(this, startapp, 12), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C3450e(this, i, 3);
        }
    }
}
