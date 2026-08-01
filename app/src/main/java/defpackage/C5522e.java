package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5522e extends AbstractC15876e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final boolean f11809e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final C14259e f11810e;

    public C5522e(String str) {
        super(null);
        this.f11809e = true;
        this.f11810e = new C14259e(str, this, 0);
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: abstract, reason: not valid java name */
    public final boolean mo1920abstract() {
        return this.f11809e;
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: catch */
    public final void mo573catch() {
        AbstractC18491e abstractC18491e = this.f21116e;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        ((C17256e) abstractC18491e).startapp.setBackgroundResource(R.drawable.scrim_top);
    }

    @Override // defpackage.AbstractC15876e
    /* renamed from: const */
    public final Cpackage mo447const() {
        return this.f11810e;
    }

    @Override // defpackage.AbstractC15876e
    /* renamed from: eًًؓ */
    public final Object mo1849e(Catalog2Section catalog2Section, C3675e c3675e, InterfaceC5083e interfaceC5083e) {
        C15409e c15409e = C15409e.ad;
        c15409e.getClass();
        C12309e c12309e = C15409e.amazon;
        InterfaceC8614e interfaceC8614e = C15409e.vip[8];
        if (!((Boolean) c12309e.tapsense(c15409e)).booleanValue()) {
            return catalog2Section;
        }
        List list = catalog2Section.license;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                Catalog2Block catalog2Block = (Catalog2Block) obj;
                Catalog2Layout vip = catalog2Block.getVip();
                Catalog2Layout.ExtendedHeader extendedHeader = vip instanceof Catalog2Layout.ExtendedHeader ? (Catalog2Layout.ExtendedHeader) vip : null;
                if (!AbstractC7890e.billing(extendedHeader != null ? extendedHeader.metrica : null, "legal_notice") && !(catalog2Block.getVip() instanceof C7510e)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        return Catalog2Section.ad(catalog2Section, arrayList);
    }

    @Override // defpackage.AbstractC15876e, defpackage.InterfaceC8370e
    public final void inmobi(CatalogArtist catalogArtist) {
        AbstractC18491e abstractC18491e = this.f21116e;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        ((C17256e) abstractC18491e).Signature(new C12439e(catalogArtist, this, 8));
        C16251e c16251e = C16251e.ad;
        AbstractC18491e abstractC18491e2 = this.f21116e;
        if (abstractC18491e2 == null) {
            abstractC18491e2 = null;
        }
        AppCompatImageView appCompatImageView = ((C17256e) abstractC18491e2).mopub;
        c16251e.ad(appCompatImageView != null ? appCompatImageView : null, EnumC14893e.f29511e);
    }
}
