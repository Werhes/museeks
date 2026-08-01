package defpackage;

import java.io.ByteArrayInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٖٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7965e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f16130e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f16131e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f16132e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16133e;

    public /* synthetic */ C7965e(int i, Object obj, Object obj2, Object obj3) {
        this.f16133e = i;
        this.f16131e = obj;
        this.f16130e = obj2;
        this.f16132e = obj3;
    }

    public C7965e(AbstractC17288e abstractC17288e, InterfaceC11542e interfaceC11542e, C5107e c5107e) {
        this.f16133e = 0;
        this.f16132e = abstractC17288e;
        this.f16131e = interfaceC11542e;
        this.f16130e = c5107e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f16133e;
        Object obj = this.f16130e;
        Object obj2 = this.f16131e;
        Object obj3 = this.f16132e;
        switch (i) {
            case 0:
                return new C11946e((AbstractC17288e) obj3, (InterfaceC11542e) obj2, (C5107e) obj);
            case 1:
                ((C11210e) obj2).m3061import((C6943e) obj, (C2567e) obj3);
                return Unit.INSTANCE;
            case 2:
                ((InterfaceC3314e) obj).setValue((MainArtist) obj2);
                ((InterfaceC3314e) obj3).setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 3:
                return ((C13141e) ((InterfaceC6066e) obj2)).metrica((ByteArrayInputStream) obj, (C18521e) ((C18277e) ((AbstractC4362e) obj3).vip.f10517e).loadAd);
            case 4:
                C8404e c8404e = (C8404e) obj2;
                Class cls = (Class) obj;
                C11709e c11709e = (C11709e) obj3;
                Class cls2 = c8404e.f17185e;
                if (AbstractC7890e.billing(cls2.getSuperclass(), cls)) {
                    return cls2.getGenericSuperclass();
                }
                int firebase = AbstractC1660e.firebase(cls, cls2.getInterfaces());
                if (firebase >= 0) {
                    return cls2.getGenericInterfaces()[firebase];
                }
                throw new Error("No superclass of " + c8404e + " in Java reflection for " + c11709e);
            case 5:
                AbstractC12654e abstractC12654e = (AbstractC12654e) obj2;
                InterfaceC11542e interfaceC11542e = ((C17241e) abstractC12654e.vip.f23950e).ad;
                C1021e c1021e = new C1021e(abstractC12654e, (C1214e) obj, (C4246e) obj3);
                C6272e c6272e = (C6272e) interfaceC11542e;
                c6272e.getClass();
                return new C16622e(c6272e, c1021e);
            case 6:
                ((C9669e) obj2).f19164e.setValue(Boolean.FALSE);
                AbstractC5336e.purchase((InterfaceC18435e) obj, null, 0, new C16600e((EnumC5778e) obj3, null, 27), 3);
                return Unit.INSTANCE;
            case 7:
                ((Function1) obj2).invoke((EnumC13413e) obj);
                int i2 = AbstractC12185e.ad;
                ((InterfaceC3314e) obj3).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                if (((Boolean) ((InterfaceC16132e) obj3).getValue()).booleanValue()) {
                    ((C4242e) obj2).license.invoke();
                } else {
                    new C9745e().signatures(((AbstractC15638e) obj).pro());
                }
                return Unit.INSTANCE;
        }
    }
}
