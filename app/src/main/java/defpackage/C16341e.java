package defpackage;

import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٛۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16341e extends AbstractC9194e {

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final String f32103e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public final Integer f32104e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final int f32105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16341e(Integer num, String str) {
        super(VKXApplication.Companion.vip(R.string.tab_popular), C14611e.ad);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        this.f32104e = num;
        this.f32103e = str;
        this.f32105e = 400;
    }

    @Override // defpackage.AbstractC10716e
    /* renamed from: catch */
    public final void mo573catch() {
        String str = this.f32103e;
        if (str != null) {
            AbstractC18491e abstractC18491e = this.f21116e;
            if (abstractC18491e == null) {
                abstractC18491e = null;
            }
            C16866e c16866e = ((C17256e) abstractC18491e).adcel;
            if (c16866e != null) {
                c16866e.setSubtitle(str);
            }
        }
    }

    @Override // defpackage.AbstractC9194e
    /* renamed from: finally */
    public final boolean mo214finally() {
        return true;
    }

    @Override // defpackage.AbstractC9194e, defpackage.AbstractC9870e
    /* renamed from: return */
    public final Object mo215return(int i, InterfaceC5083e interfaceC5083e) {
        return AbstractC18406e.yandex(new C13029e(i, this.f32105e, this.f32104e), interfaceC5083e);
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: super */
    public final int mo861super() {
        return this.f32105e;
    }

    @Override // defpackage.AbstractC9194e, defpackage.AbstractC3655e
    /* renamed from: switch */
    public final C11268e mo1386final() {
        C11268e c11268e = new C11268e(false, false, 0, this.f18367e, new C7755e(0, this, C16341e.class, "getCustomMenuItem", "getCustomMenuItem()Lkotlin/Pair;", 0, 0, 14), null, 103);
        c11268e.f22635e = new C10869e(c11268e, this, 26);
        return c11268e;
    }
}
