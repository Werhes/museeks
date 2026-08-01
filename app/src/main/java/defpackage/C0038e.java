package defpackage;

import java.io.File;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؒٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038e extends AbstractC16997e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final CatalogArtist f1174e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final Cvolatile f1175e;

    public C0038e(CatalogArtist catalogArtist, Cvolatile cvolatile) {
        super(false, 3);
        this.f1174e = catalogArtist;
        this.f1175e = cvolatile;
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(407452765);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        int i3 = 1;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            CatalogArtist catalogArtist = this.f1174e;
            boolean purchase = c13770e.purchase(catalogArtist);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                File file = AbstractC14119e.ad;
                m3681throw = Boolean.valueOf(AbstractC14119e.vip.containsKey(catalogArtist.vip));
                c13770e.m3682throws(m3681throw);
            }
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(495994808, new C14674e(((Boolean) m3681throw).booleanValue(), this, i3), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C11213e(this, i, 5);
        }
    }
}
