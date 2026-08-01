package defpackage;

import android.os.CancellationSignal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؒۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12203e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24508e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f24509e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f24510e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ Object f24511e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f24512e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12203e(InterfaceC13742e interfaceC13742e, InterfaceC11944e interfaceC11944e, C15860e c15860e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f24508e = 2;
        this.f24511e = interfaceC13742e;
        this.f24509e = interfaceC11944e;
        this.f24510e = c15860e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12203e(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f24508e = i;
        this.f24512e = obj;
        this.f24511e = obj2;
        this.f24509e = obj3;
        this.f24510e = obj4;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f24508e) {
            case 0:
                return new C12203e((C9302e) this.f24512e, (CatalogArtist) this.f24511e, (C1875e) this.f24509e, (C0714e) this.f24510e, interfaceC5083e, 0);
            case 1:
                return new C12203e((C10675e) this.f24512e, (C11154e) this.f24511e, (C2697e) this.f24509e, (List) this.f24510e, interfaceC5083e, 1);
            case 2:
                C12203e c12203e = new C12203e((InterfaceC13742e) this.f24511e, (InterfaceC11944e) this.f24509e, (C15860e) this.f24510e, interfaceC5083e);
                c12203e.f24512e = obj;
                return c12203e;
            case 3:
                return new C12203e((C10675e) this.f24512e, (String) this.f24511e, (CancellationSignal) this.f24509e, (Function2) this.f24510e, interfaceC5083e, 3);
            default:
                return new C12203e((C4748e) this.f24512e, (C18424e) this.f24511e, (String) this.f24509e, (C11753e) this.f24510e, interfaceC5083e, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f24508e) {
            case 0:
                return ((C12203e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C12203e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C12203e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C12203e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12203e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101 A[Catch: all -> 0x0104, TryCatch #2 {all -> 0x0104, blocks: (B:49:0x0101, B:50:0x0107, B:68:0x00fb, B:57:0x00f6), top: B:56:0x00f6, inners: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107 A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #2 {all -> 0x0104, blocks: (B:49:0x0101, B:50:0x0107, B:68:0x00fb, B:57:0x00f6), top: B:56:0x00f6, inners: #9 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r9v3, types: [package, eؘُۖ] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12203e.loadAd(java.lang.Object):java.lang.Object");
    }
}
