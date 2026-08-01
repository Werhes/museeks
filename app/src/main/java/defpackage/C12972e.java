package defpackage;

import android.text.format.Formatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12972e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f25857e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C3566e f25858e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f25859e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C3566e f25860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12972e(C3566e c3566e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f25857e = i;
        this.f25858e = c3566e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f25857e) {
            case 0:
                return new C12972e(this.f25858e, interfaceC5083e, 0);
            default:
                return new C12972e(this.f25858e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f25857e) {
            case 0:
                return ((C12972e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C12972e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C3566e c3566e;
        C3566e c3566e2;
        switch (this.f25857e) {
            case 0:
                int i = this.f25859e;
                if (i == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e ad = ((InterfaceC8018e) ((C6325e) AbstractC1831e.metrica().f22772e).f13170e).ad();
                    c3566e = this.f25858e;
                    this.f25860e = c3566e;
                    this.f25859e = 1;
                    obj = AbstractC7535e.startapp(ad, this);
                    EnumC2821e enumC2821e = EnumC2821e.f6782e;
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3566e = this.f25860e;
                    AbstractC2003e.purchase(obj);
                }
                c3566e.f8045e.setValue(Boolean.valueOf(((C10876e) obj).f21541e));
                return Unit.INSTANCE;
            default:
                int i2 = this.f25859e;
                C3566e c3566e3 = this.f25858e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC8615e interfaceC8615e = c3566e3.f8041e;
                    this.f25860e = c3566e3;
                    this.f25859e = 1;
                    obj = interfaceC8615e.signatures(this);
                    EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                    if (obj == enumC2821e2) {
                        return enumC2821e2;
                    }
                    c3566e2 = c3566e3;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3566e2 = this.f25860e;
                    AbstractC2003e.purchase(obj);
                }
                c3566e2.f8043e.startapp(((Number) obj).longValue());
                c3566e3.f8046e.setValue(Formatter.formatFileSize(c3566e3.f10582e, c3566e3.f8043e.purchase()));
                return Unit.INSTANCE;
        }
    }
}
