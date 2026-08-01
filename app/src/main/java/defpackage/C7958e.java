package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7958e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16109e = 0;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final /* synthetic */ Object f16110e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ Object f16111e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Object f16112e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final /* synthetic */ Object f16113e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f16114e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Object f16115e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f16116e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f16117e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f16118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7958e(InterfaceC5083e interfaceC5083e, InterfaceC6034e interfaceC6034e, Function3 function3, InterfaceC1108e[] interfaceC1108eArr) {
        super(2, interfaceC5083e);
        this.f16111e = interfaceC1108eArr;
        this.f16110e = (AbstractC7185e) function3;
        this.f16113e = interfaceC6034e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7958e(List list, C13559e c13559e, Context context, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f16111e = list;
        this.f16110e = c13559e;
        this.f16113e = context;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f16109e) {
            case 0:
                InterfaceC1108e[] interfaceC1108eArr = (InterfaceC1108e[]) this.f16111e;
                C7958e c7958e = new C7958e(interfaceC5083e, (InterfaceC6034e) this.f16113e, (Function3) this.f16110e, interfaceC1108eArr);
                c7958e.f16118e = obj;
                return c7958e;
            default:
                return new C7958e((List) this.f16111e, (C13559e) this.f16110e, (Context) this.f16113e, interfaceC5083e);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f16109e) {
            case 0:
                return ((C7958e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C7958e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006c -> B:7:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01e2 -> B:29:0x00fe). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7958e.loadAd(java.lang.Object):java.lang.Object");
    }
}
