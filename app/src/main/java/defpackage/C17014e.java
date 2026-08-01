package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17014e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33327e;

    public /* synthetic */ C17014e(int i) {
        this.f33327e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC13984e interfaceC13984e;
        int i = 2;
        char c = 1;
        int i2 = 0;
        switch (this.f33327e) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                C7145e c7145e = (C7145e) obj;
                List m3575continue = AbstractC13480e.m3575continue(((C2860e) c7145e.vip).ad);
                c7145e.ad.f18705e.billing(AbstractC1002e.license, m3575continue);
                C8017e c8017e = new C8017e();
                C12232e c12232e = AbstractC3820e.ad;
                InterfaceC7227e vip = c12232e.vip(Map.class);
                try {
                    C5538e c5538e = C5538e.metrica;
                    interfaceC13984e = c12232e.license(c12232e.smaato(c12232e.vip(Map.class), Arrays.asList(AbstractC16704e.license(AbstractC3820e.ad(C7488e.class)), AbstractC16704e.license(AbstractC3820e.ad(Integer.TYPE))), false));
                } catch (Throwable unused) {
                    interfaceC13984e = null;
                }
                C8208e c8208e = new C8208e("ProviderVersionAttributeKey", new C12025e(vip, interfaceC13984e));
                c7145e.ad(C11047e.f21905e, new C13781e(m3575continue, c8017e, c8208e, null));
                c7145e.ad(C5170e.f11056e, new C11822e(c7145e, m3575continue, c8017e, c8208e, null));
                return Unit.INSTANCE;
            case 2:
                return ((MainArtist) obj).metrica;
            case 3:
                InterfaceC5261e interfaceC5261e = (InterfaceC5261e) obj;
                return Boolean.valueOf(!interfaceC5261e.getParameters().isEmpty() && AbstractC11132e.metrica((InterfaceC8960e) interfaceC5261e.getParameters().get(0), AbstractC11132e.metrica));
            case 4:
                List parameters = ((InterfaceC5261e) obj).getParameters();
                if (parameters == null || !parameters.isEmpty()) {
                    Iterator it = parameters.iterator();
                    while (it.hasNext()) {
                        if (!((C2299e) ((InterfaceC8960e) it.next())).amazon() && (i2 = i2 + 1) < 0) {
                            AbstractC6874e.loadAd();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i2);
            case 5:
                return Integer.valueOf(((InterfaceC5261e) obj).getParameters().size());
            case 6:
                C3555e c3555e = (C3555e) obj;
                c3555e.metrica(AbstractC17480e.metrica, (int) (c3555e.ad().advert() >> 32));
                c3555e.metrica(AbstractC17480e.vip, 0.0f);
                return Unit.INSTANCE;
            case 7:
                return ((C6442e) obj).f13348e;
            case 8:
                Throwable th = (Throwable) obj;
                th.printStackTrace();
                throw th;
            case 9:
                ((Throwable) obj).printStackTrace();
                return Unit.INSTANCE;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + " = " + ((String) entry.getValue());
            case 11:
                InterfaceC5371e.ad.getClass();
                AbstractC14594e.yandex((InterfaceC15671e) obj, C8155e.metrica);
                return Unit.INSTANCE;
            case 12:
                return new C11334e(((Context) obj).getContentResolver());
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 16:
                C7145e c7145e2 = (C7145e) obj;
                int i3 = 3;
                c7145e2.ad(C16628e.f32601e, new C11864e(i3, c == true ? 1 : 0, (InterfaceC5083e) r4));
                c7145e2.ad(C1400e.f4204e, new C9754e(i, i3, r4));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C4017e) obj).ad();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Unit.INSTANCE;
            case 20:
                if (((Context) ((InterfaceC14927e) obj).mo2377else(AbstractC2676e.vip)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return AbstractC11998e.vip;
                }
                InterfaceC13547e.ad.getClass();
                return C8713e.metrica;
            case 21:
                AbstractC14594e.advert((InterfaceC15671e) obj, 0);
                return Unit.INSTANCE;
            case 22:
                AbstractC14594e.advert((InterfaceC15671e) obj, 0);
                return Unit.INSTANCE;
            case 23:
                return ((CharSequence) obj).toString();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                String str = (String) obj;
                C7838e c7838e = VKXApplication.f36530e;
                return (c7838e != null ? c7838e : 0).f15868e.startapp(str);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                String str2 = (String) obj;
                C7838e c7838e2 = VKXApplication.f36530e;
                return (c7838e2 != null ? c7838e2 : null).f15868e.startapp(str2);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C8356e c8356e = (C8356e) obj;
                AbstractC16666e controller = c8356e.getController();
                C10454e c10454e = controller instanceof C10454e ? (C10454e) controller : null;
                if (c10454e != null) {
                    AbstractC13062e.metrica();
                    c10454e.f20646interface = null;
                    c10454e.smaato = null;
                    C14598e c14598e = c10454e.amazon;
                    if (c14598e != null) {
                        c14598e.ad.ad.m1885interface();
                    }
                }
                c8356e.setController(null);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ViewParent parent = ((C8356e) obj).getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C10122e) obj).metrica(0.8f);
                return Unit.INSTANCE;
            default:
                ((C10122e) obj).metrica(0.6f);
                return Unit.INSTANCE;
        }
    }
}
