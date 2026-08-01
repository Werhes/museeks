package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٛٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18210e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f35648e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ String f35649e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C3409e f35650e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C2180e f35651e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18210e(C2180e c2180e, C3409e c3409e, String str, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f35651e = c2180e;
        this.f35650e = c3409e;
        this.f35649e = str;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C18210e c18210e = new C18210e(this.f35651e, this.f35650e, this.f35649e, interfaceC5083e);
        c18210e.f35648e = obj;
        return c18210e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C18210e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0150, code lost:
    
        r2.m1353instanceof(r13, new defpackage.C3106e(defpackage.EnumC11407e.f22932e));
        r10 = ua.itaysonlab.vkx.VKXApplication.f36528e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015c, code lost:
    
        if (r10 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0160, code lost:
    
        defpackage.AbstractC5336e.purchase(r10, null, 0, new defpackage.C14641e(2, 1, null), 3);
        r2.m1357synchronized(defpackage.C2069e.ad);
        r3.billing(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18210e.loadAd(java.lang.Object):java.lang.Object");
    }
}
