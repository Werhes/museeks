package defpackage;

import android.os.ParcelFileDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۘٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13455e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f26715e = 1;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ Object f26716e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ Object f26717e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f26718e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ Object f26719e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f26720e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f26721e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Object f26722e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f26723e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f26724e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f26725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13455e(EnumC6955e enumC6955e, C10684e c10684e, Function2 function2, Object obj, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f26717e = enumC6955e;
        this.f26716e = c10684e;
        this.f26719e = (AbstractC7185e) function2;
        this.f26720e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13455e(C9674e c9674e, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream, AbstractC11062e abstractC11062e, C10675e c10675e, C1963e c1963e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f26718e = c9674e;
        this.f26716e = autoCloseOutputStream;
        this.f26717e = abstractC11062e;
        this.f26719e = c10675e;
        this.f26720e = c1963e;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f26715e) {
            case 0:
                C13455e c13455e = new C13455e((C9674e) this.f26718e, (ParcelFileDescriptor.AutoCloseOutputStream) this.f26716e, (AbstractC11062e) this.f26717e, (C10675e) this.f26719e, (C1963e) this.f26720e, interfaceC5083e);
                c13455e.f26725e = obj;
                return c13455e;
            default:
                C13455e c13455e2 = new C13455e((EnumC6955e) this.f26717e, (C10684e) this.f26716e, (AbstractC7185e) this.f26719e, this.f26720e, interfaceC5083e);
                c13455e2.f26722e = obj;
                return c13455e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f26715e) {
            case 0:
                return ((C13455e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C13455e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e5 A[Catch: all -> 0x0201, LOOP:3: B:122:0x0136->B:149:0x01e5, LOOP_END, TryCatch #1 {all -> 0x0201, blocks: (B:128:0x016b, B:149:0x01e5, B:151:0x0200, B:154:0x01df, B:178:0x0207, B:146:0x01d7), top: B:127:0x016b, inners: #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v25, types: [eُ٘ۤ] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r11v4, types: [eِٖۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.Closeable, eّؔۜ] */
    /* JADX WARN: Type inference failed for: r4v6, types: [eِٖۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [eٍۖۥ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [eّؑۥ, eِٜؒ] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v2, types: [eُ٘ۤ] */
    /* JADX WARN: Type inference failed for: r8v12, types: [eِٖۢ, eِٜؒ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [eِٖۢ, eِٜؒ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable, eّؔۜ] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13455e.loadAd(java.lang.Object):java.lang.Object");
    }
}
