package defpackage;

import android.webkit.WebView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.internal.objects.VKResponse;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۘٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2046e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f5324e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5325e;

    public /* synthetic */ C2046e(int i, Function1 function1) {
        this.f5325e = i;
        this.f5324e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C4641e c4641e;
        switch (this.f5325e) {
            case 0:
                this.f5324e.invoke(((VKResponse) obj).ad);
                return Unit.INSTANCE;
            case 1:
                this.f5324e.invoke(((VKResponse) obj).ad);
                return Unit.INSTANCE;
            case 2:
                this.f5324e.invoke((C18141e) obj);
                return Unit.INSTANCE;
            case 3:
                C16439e c16439e = (C16439e) obj;
                return Double.valueOf((c16439e == null || (c4641e = (C4641e) this.f5324e.invoke(c16439e)) == null) ? 50.0d : c4641e.ad(c16439e));
            case 4:
                Function1 function1 = this.f5324e;
                InterfaceC6459e interfaceC6459e = (InterfaceC6459e) obj;
                if (!(interfaceC6459e instanceof C5943e)) {
                    throw new IllegalStateException("Node is not a GestureNode instance");
                }
                Boolean bool = (Boolean) function1.invoke(((C5943e) interfaceC6459e).f12527e);
                bool.getClass();
                return bool;
            case 5:
                this.f5324e.invoke(((List) obj).get(0));
                return Unit.INSTANCE;
            case 6:
                Function1 function12 = this.f5324e;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                function12.invoke(bool2);
                return Unit.INSTANCE;
            case 7:
                throw AbstractC8647e.isVip(obj);
            case 8:
                Function1 function13 = this.f5324e;
                if (((EnumC16488e) obj).vip()) {
                    function13.invoke(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 9:
                this.f5324e.invoke(BuildConfig.FLAVOR);
                return Unit.INSTANCE;
            case 10:
                AbstractC13717e abstractC13717e = (AbstractC13717e) this.f5324e.invoke((C11353e) obj);
                synchronized (AbstractC12909e.metrica) {
                    AbstractC12909e.license = AbstractC12909e.license.adcel(abstractC13717e.billing());
                    Unit unit = Unit.INSTANCE;
                }
                return abstractC13717e;
            case 11:
                Function1 function14 = this.f5324e;
                Long l = (Long) obj;
                l.longValue();
                return function14.invoke(l);
            case 12:
                return new C13440e((EnumC3856e) obj, this.f5324e);
            case 13:
                return new C2628e((EnumC11762e) obj, this.f5324e);
            case 14:
                Function1 function15 = this.f5324e;
                if (((EnumC16488e) obj).vip()) {
                    function15.invoke(0);
                }
                return Unit.INSTANCE;
            case 15:
                Function1 function16 = this.f5324e;
                if (((EnumC16488e) obj).vip()) {
                    function16.invoke(1);
                }
                return Unit.INSTANCE;
            case 16:
                this.f5324e.invoke((List) obj);
                return Unit.INSTANCE;
            default:
                this.f5324e.invoke((WebView) obj);
                return Unit.INSTANCE;
        }
    }
}
