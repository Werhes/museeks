package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.activity.AppActivity;

/* renamed from: eّؒۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1021e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f3475e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f3476e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3477e;

    public C1021e(AbstractC12654e abstractC12654e, C1214e c1214e, C4246e c4246e) {
        this.f3477e = 1;
        this.f3476e = abstractC12654e;
        this.f3475e = c4246e;
    }

    public /* synthetic */ C1021e(Object obj, Object obj2, int i) {
        this.f3477e = i;
        this.f3476e = obj;
        this.f3475e = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, eؕٛؓ] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Activity activity;
        String str;
        C4542e license;
        switch (this.f3477e) {
            case 0:
                C11980e c11980e = (C11980e) this.f3476e;
                C5218e c5218e = (C5218e) this.f3475e;
                C13935e c13935e = ((C17241e) c11980e.f23950e).vip;
                c5218e.loadAd.getClass();
                c13935e.getClass();
                return null;
            case 1:
                AbstractC12654e abstractC12654e = (AbstractC12654e) this.f3476e;
                C4246e c4246e = (C4246e) this.f3475e;
                C16628e c16628e = ((C17241e) abstractC12654e.vip.f23950e).yandex;
                c16628e.getClass();
                return null;
            case 2:
                C13520e c13520e = (C13520e) this.f3476e;
                InterfaceC9905e interfaceC9905e = (InterfaceC9905e) ((C6012e) this.f3475e).f12660e.invoke();
                c13520e.getClass();
                return (AbstractC1186e) interfaceC9905e;
            case 3:
                ((AbstractC15876e) this.f3476e).m4034e((String) this.f3475e);
                return Unit.INSTANCE;
            case 4:
                Function1 function1 = ((C3662e) this.f3476e).metrica;
                C11683e c11683e = (C11683e) this.f3475e;
                Function0 function0 = c11683e.f23493e;
                if (function0 == null || (activity = (Activity) function0.invoke()) == null) {
                    activity = c11683e.f10582e;
                }
                function1.invoke(activity);
                c11683e.purchase();
                return Unit.INSTANCE;
            case 5:
                new C1208e((AudioTrack) this.f3476e).signatures(((C13182e) this.f3475e).f10582e);
                return Unit.INSTANCE;
            case 6:
                ((C11439e) this.f3476e).m2514goto(new C3625e((C14163e) this.f3475e));
                return Unit.INSTANCE;
            case 7:
                C11439e c11439e = (C11439e) this.f3476e;
                Activity pro = c11439e.pro();
                C14474e c14474e = new C14474e((InterfaceC8346e) c11439e.f23004e.getValue());
                String valueOf = String.valueOf(((C12817e) this.f3475e).ad);
                AbstractC13201e.vip(pro, c14474e, new C0086e(valueOf != null ? new C1703e(valueOf) : C2406e.ad, 0L, null, false, false, false, 126));
                return Unit.INSTANCE;
            case 8:
                C3625e c3625e = (C3625e) this.f3476e;
                Activity pro2 = c3625e.pro();
                C14474e c14474e2 = new C14474e((InterfaceC8346e) c3625e.f8170e.getValue());
                String valueOf2 = String.valueOf(((C12817e) this.f3475e).ad);
                AbstractC13201e.vip(pro2, c14474e2, new C0086e(valueOf2 != null ? new C1703e(valueOf2) : C2406e.ad, 0L, null, false, false, false, 126));
                return Unit.INSTANCE;
            case 9:
                C17236e c17236e = (C17236e) this.f3476e;
                C13520e c13520e2 = (C13520e) this.f3475e;
                Iterable iterable = (List) c17236e.f33764e.getValue();
                if (iterable == null) {
                    iterable = C13664e.f27089e;
                }
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC15728e) it.next()).signatures(c13520e2));
                }
                return arrayList;
            case 10:
                C9669e c9669e = (C9669e) this.f3476e;
                c9669e.m2624import(false);
                AbstractC5336e.purchase(AbstractC4608e.metrica(c9669e.vip()), null, 0, new C16600e((EnumC4169e) this.f3475e, null, 28), 3);
                return Unit.INSTANCE;
            case 11:
                ((Function1) this.f3476e).invoke((EnumC18308e) this.f3475e);
                return Unit.INSTANCE;
            case 12:
                C14155e.billing((View) this.f3476e, ((C10876e) ((InterfaceC16132e) this.f3475e).getValue()).f21540e);
                return Unit.INSTANCE;
            case 13:
                ((Function1) this.f3476e).invoke((C14609e) this.f3475e);
                return Unit.INSTANCE;
            case 14:
                ((C8510e) this.f3476e).f17312e.advert((EnumC2646e) this.f3475e);
                return Unit.INSTANCE;
            case 15:
                C8510e c8510e = (C8510e) this.f3476e;
                AbstractC5336e.purchase(AbstractC4608e.metrica(c8510e.vip()), null, 0, new C8086e((C11235e) this.f3475e, c8510e, null, 2), 3);
                return Unit.INSTANCE;
            case 16:
                C5421e c5421e = (C5421e) this.f3476e;
                AudioTrack audioTrack = (AudioTrack) this.f3475e;
                c5421e.m2514goto(new C13642e(audioTrack.vip, audioTrack.metrica));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C9261e c9261e = (C9261e) this.f3476e;
                VKProfile vKProfile = (VKProfile) this.f3475e;
                String str2 = vKProfile.appmetrica;
                c9261e.m2514goto(new C3375e((str2 == null || str2.length() == 0) ? vKProfile.ad : -vKProfile.ad, vKProfile.license, vKProfile.ad()));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C14197e c14197e = (C14197e) this.f3476e;
                C0004e c0004e = (C0004e) this.f3475e;
                if (c14197e.f28048e == null && !((Boolean) c14197e.f28051e.getValue()).booleanValue() && (str = c0004e.metrica) != null && str.length() != 0) {
                    c14197e.f28048e = AbstractC5336e.purchase(c14197e, AbstractC6731e.ad, 0, new C17019e(c14197e, c0004e, (InterfaceC5083e) null), 2);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                new C17312e(null, (C5181e) this.f3476e, 7).signatures(((C14141e) this.f3475e).pro());
                return Unit.INSTANCE;
            case 20:
                new C17312e((C12560e) this.f3476e, null, 11).signatures(((C4944e) this.f3475e).pro());
                return Unit.INSTANCE;
            case 21:
                ((C4834e) this.f3476e).vip.invoke((EnumC4248e) this.f3475e);
                return Unit.INSTANCE;
            case 22:
                ((C0073e) this.f3476e).vip.invoke((C16655e) this.f3475e);
                return Unit.INSTANCE;
            case 23:
                new C10907e((C0943e) this.f3476e).signatures(((C6267e) this.f3475e).pro());
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C11245e c11245e = (C11245e) this.f3476e;
                C7283e c7283e = (C7283e) this.f3475e;
                InterfaceC11542e interfaceC11542e = c11245e.f22534e;
                InterfaceC9794e interfaceC9794e = c11245e.f22533e;
                InterfaceC2460e annotations = c7283e.getAnnotations();
                C7283e c7283e2 = c7283e;
                int mo334e = c7283e2.mo334e();
                InterfaceC15633e interfaceC15633e = c11245e.f22533e;
                C11245e c11245e2 = new C11245e(interfaceC11542e, interfaceC9794e, c7283e, c11245e, annotations, mo334e, ((AbstractC16946e) interfaceC15633e).adcel());
                C11245e.f22532e.getClass();
                C14457e c14457e = (C14457e) interfaceC15633e;
                if (c14457e.m3805e() == null) {
                    license = null;
                } else {
                    AbstractC10226e abstractC10226e = c14457e.f28577e;
                    if (abstractC10226e == null) {
                        abstractC10226e = null;
                    }
                    license = C4542e.license(abstractC10226e);
                }
                if (license == null) {
                    return null;
                }
                C16169e c16169e = c7283e2.f29668e;
                C16169e remoteconfig = c16169e != null ? c16169e.remoteconfig(license) : null;
                List mo2242e = c7283e2.mo2242e();
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(mo2242e, 10));
                Iterator it2 = mo2242e.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C16169e) it2.next()).remoteconfig(license));
                }
                C14457e c14457e2 = (C14457e) interfaceC15633e;
                List list = c14457e2.f28578e;
                c11245e2.mo470e(null, remoteconfig, arrayList2, list == null ? null : list, c11245e.mo330e(), c11245e.f29665e, 1, c14457e2.f28581e);
                return c11245e2;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C5306e c5306e = (C5306e) this.f3476e;
                C13212e c13212e = (C13212e) this.f3475e;
                C4956e c4956e = (C4956e) c5306e.f11400e;
                return ((InterfaceC18372e) ((C18277e) c4956e.f10517e).appmetrica).purchase(c13212e, (InterfaceC11824e) c4956e.f10513e);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C4031e c4031e = (C4031e) this.f3476e;
                c4031e.f8963e.setValue(Boolean.FALSE);
                c4031e.f8964e.setValue((EnumC7808e) this.f3475e);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((Function1) this.f3476e).invoke((C15797e) this.f3475e);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C12672e c12672e = (C12672e) this.f3476e;
                String str3 = ((UmaArtist) this.f3475e).startapp;
                if (str3 != null) {
                    c12672e.m2514goto(new C5522e(str3));
                }
                return Unit.INSTANCE;
            default:
                AbstractC16519e.vip((AppActivity) ((C2743e) this.f3476e).pro(), new C16600e(new C8381e(((UmaTag) this.f3475e).vip), null, 16));
                return Unit.INSTANCE;
        }
    }
}
