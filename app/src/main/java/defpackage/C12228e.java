package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؔؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12228e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f24545e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f24546e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f24547e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public Object f24548e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Object f24549e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f24550e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f24551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12228e(int i, InterfaceC5083e interfaceC5083e) {
        super(i, interfaceC5083e);
        this.f24545e = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12228e(AbstractC16997e abstractC16997e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f24545e = i;
        this.f24548e = abstractC16997e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12228e(Object obj, Context context, int i, Object obj2, InterfaceC5083e interfaceC5083e, int i2) {
        super(2, interfaceC5083e);
        this.f24545e = i2;
        this.f24547e = obj;
        this.f24549e = context;
        this.f24546e = i;
        this.f24548e = obj2;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f24545e) {
            case 0:
                C12228e c12228e = new C12228e((AbstractC12260e) this.f24547e, (Context) this.f24549e, this.f24546e, (Bundle) this.f24548e, interfaceC5083e, 0);
                c12228e.f24550e = obj;
                return c12228e;
            case 1:
                C12228e c12228e2 = new C12228e((AbstractC12260e) this.f24547e, (Context) this.f24549e, this.f24546e, (String) this.f24548e, interfaceC5083e, 1);
                c12228e2.f24550e = obj;
                return c12228e2;
            case 2:
                C12228e c12228e3 = new C12228e((C8054e) this.f24548e, interfaceC5083e, 2);
                c12228e3.f24549e = obj;
                return c12228e3;
            case 3:
                C12228e c12228e4 = new C12228e(2, interfaceC5083e);
                c12228e4.f24550e = obj;
                return c12228e4;
            case 4:
                return new C12228e((C1768e) this.f24547e, (Context) this.f24549e, this.f24546e, (InterfaceC3314e) this.f24548e, interfaceC5083e, 4);
            default:
                C12228e c12228e5 = new C12228e((C13552e) this.f24548e, interfaceC5083e, 5);
                c12228e5.f24550e = obj;
                return c12228e5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f24545e) {
            case 0:
                return ((C12228e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C12228e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C12228e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C12228e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C12228e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12228e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0254 A[LOOP:0: B:76:0x024e->B:78:0x0254, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01fe  */
    /* JADX WARN: Type inference failed for: r12v12, types: [eٌّؒ, eٔؐۜ] */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12228e.loadAd(java.lang.Object):java.lang.Object");
    }
}
