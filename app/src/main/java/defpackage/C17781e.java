package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17781e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f34856e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f34857e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Comparable f34858e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ Object f34859e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f34860e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f34861e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f34862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17781e(Uri uri, C11106e c11106e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f34856e = 2;
        this.f34858e = uri;
        this.f34859e = c11106e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17781e(C1439e c1439e, String str, int i, int i2, C11753e c11753e, InterfaceC5083e interfaceC5083e, int i3) {
        super(2, interfaceC5083e);
        this.f34856e = i3;
        this.f34861e = c1439e;
        this.f34858e = str;
        this.f34860e = i;
        this.f34857e = i2;
        this.f34859e = c11753e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f34856e) {
            case 0:
                return new C17781e((C1439e) this.f34861e, (String) this.f34858e, this.f34860e, this.f34857e, (C11753e) this.f34859e, interfaceC5083e, 0);
            case 1:
                return new C17781e((C1439e) this.f34861e, (String) this.f34858e, this.f34860e, this.f34857e, (C11753e) this.f34859e, interfaceC5083e, 1);
            default:
                C17781e c17781e = new C17781e((Uri) this.f34858e, (C11106e) this.f34859e, interfaceC5083e);
                c17781e.f34861e = obj;
                return c17781e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f34856e) {
            case 0:
                return ((C17781e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C17781e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C17781e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17781e.loadAd(java.lang.Object):java.lang.Object");
    }
}
