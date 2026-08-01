package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6393e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f13247e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f13248e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ File f13249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6393e(File file, String str, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f13249e = file;
        this.f13248e = str;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C6393e(this.f13249e, this.f13248e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6393e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f13247e;
        File file = this.f13249e;
        boolean z = true;
        try {
            if (i == 0) {
                AbstractC2003e.purchase(obj);
                if (file.exists()) {
                    file.delete();
                }
                file.createNewFile();
                VKXApplication.Companion companion = VKXApplication.f36531e;
                C1343e ad = AbstractC12918e.ad();
                C18464e c18464e = new C18464e(23);
                c18464e.m4486e(this.f13248e);
                C4602e vip = ad.vip(new C8650e(c18464e));
                this.f13247e = 1;
                obj = AbstractC1328e.metrica(vip, this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (obj == enumC2821e) {
                    return enumC2821e;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
            }
            C11058e c11058e = (C11058e) obj;
            C9674e c9674e = new C9674e(AbstractC8636e.license(file));
            try {
                AbstractC3192e.vip(c9674e.mo2629class(c11058e.f21945e.mo1012e()));
                try {
                    c9674e.close();
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    c9674e.close();
                } catch (Throwable th3) {
                    AbstractC13362e.license(th, th3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        if (th == null) {
            return Boolean.valueOf(z);
        }
        throw th;
    }
}
