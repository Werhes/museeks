package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9028e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5891e f18084e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18085e;

    public /* synthetic */ C9028e(C5891e c5891e, int i) {
        this.f18085e = i;
        this.f18084e = c5891e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3566e c3566e = (C3566e) obj;
        switch (this.f18085e) {
            case 0:
                new C17046e((CatalogArtist) this.f18084e.f12440e, false).signatures(c3566e.f10582e);
                c3566e.purchase();
                return Unit.INSTANCE;
            case 1:
                new C13424e(new C12721e((CatalogArtist) this.f18084e.f12440e)).signatures(c3566e.f10582e);
                c3566e.purchase();
                return Unit.INSTANCE;
            case 2:
                C5891e c5891e = this.f18084e;
                new C0038e((CatalogArtist) c5891e.f12440e, (Cvolatile) c5891e.f12439e).signatures(c3566e.f10582e);
                c3566e.purchase();
                return Unit.INSTANCE;
            case 3:
                C5891e c5891e2 = this.f18084e;
                new C0038e((CatalogArtist) c5891e2.f12440e, (Cvolatile) c5891e2.f12439e).signatures(c3566e.f10582e);
                c3566e.purchase();
                return Unit.INSTANCE;
            default:
                new C17046e((CatalogArtist) this.f18084e.f12440e, true).signatures(c3566e.f10582e);
                c3566e.purchase();
                return Unit.INSTANCE;
        }
    }
}
