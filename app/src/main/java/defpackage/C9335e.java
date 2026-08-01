package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9335e extends C7460e implements Function3 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f18593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9335e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f18593e = i4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f18593e;
        int i2 = 24;
        String str = BuildConfig.FLAVOR;
        boolean z = false;
        Object obj4 = this.f7266e;
        switch (i) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = (ViewTreeObserverOnGlobalLayoutListenerC5014e) obj4;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC5014e.getContext().getResources();
                C10740e c10740e = new C10740e(new C11315e(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((C2108e) obj2).ad, (Function1) obj3);
                if (Build.VERSION.SDK_INT >= 24) {
                    return Boolean.valueOf(C12077e.ad.ad(viewTreeObserverOnGlobalLayoutListenerC5014e, null, c10740e));
                }
                throw null;
            case 1:
                AbstractC6401e.license(((C14137e) obj4).f27963e, obj2, (InterfaceC8850e) obj3);
                return Unit.INSTANCE;
            case 2:
                AbstractC6401e.license(((C14137e) obj4).f27963e, C0183e.ad(((C0183e) obj2).ad), (InterfaceC8850e) obj3);
                return Unit.INSTANCE;
            case 3:
                ((C0139e) obj4).getClass();
                C0139e.ad((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 4:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                ((C0139e) obj4).getClass();
                if (C5658e.vip != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append('_');
                    sb.append(str3);
                    if (str4 != null) {
                        str = "_".concat(str4);
                    }
                    sb.append(str);
                    AbstractC18406e.purchase(new C13029e(new String[]{sb.toString()}), new C17187e(i2));
                }
                return Unit.INSTANCE;
            case 5:
                ((C0139e) obj4).getClass();
                C0139e.ad((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 6:
                ((C0139e) obj4).getClass();
                C0139e.ad((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 7:
                ((C0139e) obj4).getClass();
                C0139e.ad((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 8:
                ((C0139e) obj4).getClass();
                C0139e.vip((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 9:
                String str5 = (String) obj;
                String str6 = (String) obj2;
                String str7 = (String) obj3;
                ((C0139e) obj4).getClass();
                AppActivity appActivity = C5658e.vip;
                if (appActivity != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str5);
                    sb2.append('_');
                    sb2.append(str6);
                    sb2.append(str7 != null ? "_".concat(str7) : BuildConfig.FLAVOR);
                    AbstractC13201e.license(appActivity, new C18231e(Collections.singletonList(sb2.toString()), BuildConfig.FLAVOR));
                }
                return Unit.INSTANCE;
            case 10:
                ((C0139e) obj4).getClass();
                C0139e.vip((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 11:
                ((C0139e) obj4).getClass();
                C0139e.vip((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 12:
                ((C0139e) obj4).getClass();
                C0139e.vip((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 13:
                InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj3;
                PlaybackService playbackService = (PlaybackService) obj4;
                int i3 = PlaybackService.f36732e;
                playbackService.getClass();
                C9759e c9759e = new C9759e(0, new Bundle());
                C9759e c9759e2 = new C9759e(-6, new Bundle());
                String str8 = ((C11858e) obj).vip;
                if (AbstractC7890e.billing(str8, AbstractC6826e.ad.vip)) {
                    C7838e advert = PlaybackService.advert();
                    C12318e c12318e = advert.f15864e;
                    if (c12318e != null) {
                        c12318e.release();
                    }
                    advert.f15864e = null;
                    playbackService.premium();
                    return c9759e;
                }
                if (!AbstractC7890e.billing(str8, AbstractC6826e.vip.vip)) {
                    return c9759e2;
                }
                C1439e c1439e = playbackService.f36747e;
                C4748e c4748e = playbackService.f36750e;
                if (c4748e == null) {
                    c4748e = null;
                }
                C1962e mo2113e = c4748e.ad().mo2113e();
                return c1439e.vip(mo2113e != null ? mo2113e.ad : null, null, interfaceC5083e);
            default:
                long longValue = ((Number) obj).longValue();
                ((C6609e) obj4).getClass();
                if (!AbstractC7890e.billing((String) obj2, "vk")) {
                    return Boolean.FALSE;
                }
                ArrayList billing = AbstractC1831e.vip().billing();
                if (!billing.isEmpty()) {
                    Iterator it = billing.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C11048e) it.next()).ad == longValue) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
