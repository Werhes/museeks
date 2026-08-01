package defpackage;

import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11435e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f22987e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ Object f22988e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public Object f22989e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f22990e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ Object f22991e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f22992e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Object f22993e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f22994e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f22995e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f22996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11435e(Activity activity, String str, String str2, InterfaceC4082e interfaceC4082e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22987e = 0;
        this.f22990e = activity;
        this.f22989e = str;
        this.f22988e = str2;
        this.f22991e = interfaceC4082e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11435e(C6616e c6616e, C5707e c5707e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22987e = 4;
        this.f22988e = c6616e;
        this.f22991e = c5707e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11435e(C8221e c8221e, String str, C0272e c0272e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22987e = 1;
        this.f22988e = c8221e;
        this.f22995e = str;
        this.f22991e = c0272e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11435e(C8794e c8794e, C4108e c4108e, C8794e c8794e2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f22987e = 2;
        this.f22989e = c8794e;
        this.f22988e = c4108e;
        this.f22991e = c8794e2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11435e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f22987e = i;
        this.f22994e = obj;
        this.f22990e = obj2;
        this.f22995e = obj3;
        this.f22993e = obj4;
        this.f22989e = obj5;
        this.f22988e = obj6;
        this.f22991e = obj7;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f22987e) {
            case 0:
                return new C11435e((Activity) this.f22990e, (String) this.f22989e, (String) this.f22988e, (InterfaceC4082e) this.f22991e, interfaceC5083e);
            case 1:
                C11435e c11435e = new C11435e((C8221e) this.f22988e, (String) this.f22995e, (C0272e) this.f22991e, interfaceC5083e);
                c11435e.f22989e = obj;
                return c11435e;
            case 2:
                C11435e c11435e2 = new C11435e((C8794e) this.f22989e, (C4108e) this.f22988e, (C8794e) this.f22991e, interfaceC5083e);
                c11435e2.f22993e = obj;
                return c11435e2;
            case 3:
                C11435e c11435e3 = new C11435e((C4246e) this.f22994e, (InterfaceC13033e) this.f22990e, (C4070e) this.f22995e, (C11467e) this.f22993e, (InterfaceC6334e) this.f22989e, (Function3) this.f22988e, (C5317e) this.f22991e, interfaceC5083e, 3);
                c11435e3.f22992e = obj;
                return c11435e3;
            case 4:
                return new C11435e((C6616e) this.f22988e, (C5707e) this.f22991e, interfaceC5083e);
            default:
                C11435e c11435e4 = new C11435e((C8574e) this.f22994e, (C16007e) this.f22990e, (C1615e) this.f22995e, (Context) this.f22993e, (C14390e) this.f22989e, (C1633e) this.f22988e, (C11885e) this.f22991e, interfaceC5083e, 5);
                c11435e4.f22992e = obj;
                return c11435e4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f22987e) {
            case 0:
                return ((C11435e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C11435e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C11435e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C11435e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C11435e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C11435e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0486, code lost:
    
        if (r8 == r9) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e6, code lost:
    
        if (r3 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e8, code lost:
    
        ((defpackage.C8823e) r3).m2175import(java.lang.Boolean.FALSE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0203, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01fe, code lost:
    
        if (r3 == null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d2 A[Catch: all -> 0x0371, TRY_ENTER, TryCatch #0 {all -> 0x0371, blocks: (B:168:0x036a, B:170:0x0486, B:174:0x03d2, B:176:0x03df, B:177:0x03eb, B:179:0x03f1, B:180:0x03fe, B:183:0x0406, B:184:0x0431, B:186:0x0437, B:187:0x0463, B:189:0x047a, B:193:0x047f, B:197:0x048a, B:199:0x04a4, B:200:0x04a9, B:202:0x04af, B:203:0x04b4, B:205:0x04ba, B:206:0x04bd, B:208:0x04c3), top: B:167:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x048a A[Catch: all -> 0x0371, TryCatch #0 {all -> 0x0371, blocks: (B:168:0x036a, B:170:0x0486, B:174:0x03d2, B:176:0x03df, B:177:0x03eb, B:179:0x03f1, B:180:0x03fe, B:183:0x0406, B:184:0x0431, B:186:0x0437, B:187:0x0463, B:189:0x047a, B:193:0x047f, B:197:0x048a, B:199:0x04a4, B:200:0x04a9, B:202:0x04af, B:203:0x04b4, B:205:0x04ba, B:206:0x04bd, B:208:0x04c3), top: B:167:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v5, types: [eؚٓٞ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [eّؖٝ, java.lang.Object] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11435e.loadAd(java.lang.Object):java.lang.Object");
    }
}
