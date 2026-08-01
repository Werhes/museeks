package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: eٖٓٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16188e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f31802e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f31803e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f31804e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31805e;

    public /* synthetic */ C16188e(Object obj, Object obj2, int i, int i2) {
        this.f31805e = i2;
        this.f31803e = obj;
        this.f31802e = obj2;
        this.f31804e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f31805e) {
            case 0:
                C9864e c9864e = (C9864e) this.f31803e;
                AbstractC6649e abstractC6649e = (AbstractC6649e) this.f31802e;
                C4956e c4956e = c9864e.ad;
                AbstractC7919e ad = c9864e.ad((InterfaceC15498e) c4956e.f10512e);
                List m3575continue = ad != null ? AbstractC13480e.m3575continue(((InterfaceC18372e) ((C18277e) c4956e.f10517e).appmetrica).signatures(ad, abstractC6649e, this.f31804e)) : null;
                return m3575continue == null ? C13664e.f27089e : m3575continue;
            case 1:
                C9864e c9864e2 = (C9864e) this.f31803e;
                AbstractC6649e abstractC6649e2 = (AbstractC6649e) this.f31802e;
                C4956e c4956e2 = c9864e2.ad;
                AbstractC7919e ad2 = c9864e2.ad((InterfaceC15498e) c4956e2.f10512e);
                List advert = ad2 != null ? ((InterfaceC18372e) ((C18277e) c4956e2.f10517e).appmetrica).advert(ad2, abstractC6649e2, this.f31804e) : null;
                return advert == null ? C13664e.f27089e : advert;
            default:
                C6613e c6613e = (C6613e) this.f31803e;
                C7719e c7719e = (C7719e) ((ArrayList) this.f31802e).get(this.f31804e);
                boolean z = c7719e.metrica == null;
                EnumC13937e enumC13937e = (EnumC13937e) c6613e.f13645e;
                boolean z2 = enumC13937e == EnumC13937e.TYPE_PARAMETER_BOUNDS;
                if (!z && !z2) {
                    enumC13937e = EnumC13937e.TYPE_USE;
                }
                C11243e c11243e = c7719e.vip;
                if (c11243e != null) {
                    return (C17911e) c11243e.ad.get(enumC13937e);
                }
                return null;
        }
    }
}
