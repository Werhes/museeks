package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f3297e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f3298e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ String f3299e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ List f3300e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f3301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897e(List list, int i, String str, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f3300e = list;
        this.f3298e = i;
        this.f3299e = str;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C0897e c0897e = new C0897e(this.f3300e, this.f3298e, this.f3299e, interfaceC5083e);
        c0897e.f3301e = obj;
        return c0897e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0897e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        Object c0552e;
        int i = this.f3297e;
        int i2 = 1;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            int i3 = this.f3298e;
            List list = this.f3300e;
            String str = (String) AbstractC13480e.m3592native(i3, list);
            String str2 = this.f3299e;
            boolean z = AbstractC7890e.billing(str2, "episode") || AbstractC7890e.billing(str2, "episode_list") || AbstractC5304e.inmobi((CharSequence) list.get(0), "_Episode", false);
            VKXApplication.Companion companion = VKXApplication.f36531e;
            if (!VKXApplication.Companion.metrica()) {
                c0552e = new C0552e(list);
            } else if (z) {
                List m1869private = AbstractC5304e.m1869private((CharSequence) AbstractC5304e.m1869private((CharSequence) list.get(0), new String[]{"_Episode"}, 6).get(0), new String[]{"_"}, 6);
                c0552e = new C4464e(Long.parseLong((String) m1869private.get(0)), Integer.parseInt((String) m1869private.get(1)), BuildConfig.FLAVOR);
            } else {
                c0552e = new C18231e(list);
            }
            InterfaceC14517e c1703e = str != null ? new C1703e(str) : C2406e.ad;
            this.f3301e = null;
            this.f3297e = 1;
            Object advert = AbstractC5336e.advert(AbstractC6731e.ad, new C6046e(new C0086e(c1703e, 0L, null, false, false, false, 118), c0552e, (InterfaceC5083e) null, i2), this);
            Object obj2 = EnumC2821e.f6782e;
            if (advert != obj2) {
                advert = Unit.INSTANCE;
            }
            if (advert == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }
}
