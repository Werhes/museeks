package defpackage;

import android.app.Activity;
import android.util.Size;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.vip;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1708e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f4645e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f4646e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4647e;

    public /* synthetic */ C1708e(Object obj, Object obj2, int i) {
        this.f4647e = i;
        this.f4646e = obj;
        this.f4645e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        int i = this.f4647e;
        int i2 = 2;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj2 = this.f4645e;
        Object obj3 = this.f4646e;
        switch (i) {
            case 0:
                ((Function1) ((C10985e) obj3).f21740e).invoke((View) obj2);
                return Unit.INSTANCE;
            case 1:
                ((Function1) obj3).invoke((CustomCatalogBlockItem) obj2);
                return Unit.INSTANCE;
            case 2:
                AbstractC14297e abstractC14297e = (AbstractC14297e) obj2;
                return new C16981e(abstractC14297e, (NativePointer) vip.appmetrica(((C14918e) obj3).ad(), (NativePointer) abstractC14297e.f28277e.f34141e).f13544e);
            case 3:
                C7537e c7537e = (C7537e) obj2;
                new C7855e((C0160e) obj3, null).signatures(c7537e.f10582e);
                c7537e.purchase();
                return Unit.INSTANCE;
            case 4:
                C8416e.appmetrica.vip(new C0389e((AudioPlaylist) obj3, (List) obj2, BuildConfig.FLAVOR));
                return Unit.INSTANCE;
            case 5:
                List list = (List) obj2;
                C8416e.appmetrica.vip(new AbstractC3002e(String.valueOf(list.hashCode()), (String) obj3, list));
                return Unit.INSTANCE;
            case 6:
                C14478e c14478e = (C14478e) obj2;
                InterfaceC14388e interfaceC14388e = AbstractC5851e.mopub(c14478e).f27604e;
                c14478e.f28609e.purchase();
                int purchase = c14478e.f28608e.purchase();
                ((C13415e) obj3).getClass();
                return Integer.valueOf(AbstractC1561e.appmetrica(0.33333334f * purchase));
            case 7:
                C12894e c12894e = (C12894e) obj2;
                String str = (String) c12894e.f25751e;
                InterfaceC12424e interfaceC12424e = (InterfaceC12424e) c12894e.f25750e;
                InterfaceC18315e ad = ((C13410e) obj3).ad(str);
                if (ad == null) {
                    return new C9368e();
                }
                Set vip = interfaceC12424e.vip();
                if (vip.isEmpty()) {
                    return new C9368e();
                }
                LinkedHashMap linkedHashMap = AbstractC14417e.ad;
                String str2 = AbstractC0172e.ad;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Map.Entry entry : ((Map) AbstractC0172e.billing.getValue()).entrySet()) {
                    C14677e c14677e = (C14677e) entry.getKey();
                    C11019e c11019e = (C11019e) entry.getValue();
                    c11019e.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = c11019e.ad.values().iterator();
                    while (it.hasNext()) {
                        Set set = (Set) ((Map) it.next()).get(str);
                        if (set != null) {
                            arrayList.addAll(set);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        linkedHashSet.add(c14677e);
                    }
                }
                LinkedHashSet m3578extends = AbstractC13480e.m3578extends(vip, linkedHashSet);
                if (m3578extends.isEmpty()) {
                    return new C9368e();
                }
                List mo3341class = interfaceC12424e.mo3341class(34);
                HashSet hashSet = new HashSet(AbstractC10064e.appmetrica(AbstractC0746e.subscription(mo3341class, 12)));
                AbstractC13480e.m3574const(mo3341class, hashSet);
                C18525e c18525e = C18525e.appmetrica;
                ArrayList arrayList2 = new ArrayList(C18525e.smaato);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof C18525e) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C18525e c18525e2 = (C18525e) it3.next();
                    Iterator it4 = c18525e2.license.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj = it4.next();
                            Size size = (Size) obj;
                            if (!hashSet.contains(size) || !ad.mo379e(size.getWidth(), size.getHeight())) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Size size2 = (Size) obj;
                    C6571e c6571e = size2 != null ? new C6571e(c18525e2, size2) : null;
                    if (c6571e != null) {
                        arrayList4.add(c6571e);
                    }
                }
                Map mopub = AbstractC10064e.mopub(arrayList4);
                return mopub.isEmpty() ? new C9368e() : new C9368e(m3578extends, mopub);
            case 8:
                ((C16918e) obj3).m2514goto(new C3625e((C14163e) obj2));
                return Unit.INSTANCE;
            case 9:
                C16918e c16918e = (C16918e) obj3;
                c16918e.f33144e.setValue(Boolean.valueOf(!c16918e.m4225finally()));
                AbstractC12273e.license.vip(Boolean.valueOf(!((Boolean) r0.ad()).booleanValue()));
                c16918e.f33141e.setValue(Boolean.FALSE);
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 10:
                ((C17158e) obj3).m2514goto(new C11439e((C16607e) obj2));
                return Unit.INSTANCE;
            case 11:
                C17158e c17158e = (C17158e) obj3;
                c17158e.f33648e.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                AbstractC12273e.appmetrica.vip(Boolean.valueOf(!((Boolean) r0.ad()).booleanValue()));
                c17158e.f33649e.setValue(Boolean.FALSE);
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 12:
                C16918e c16918e2 = (C16918e) obj3;
                c16918e2.f33144e.setValue(Boolean.valueOf(!c16918e2.m4224const()));
                AbstractC12273e.vip.vip(Boolean.valueOf(!((Boolean) r0.ad()).booleanValue()));
                c16918e2.f33141e.setValue(Boolean.FALSE);
                ((Function0) obj2).invoke();
                return Unit.INSTANCE;
            case 13:
                C16918e c16918e3 = (C16918e) obj3;
                Activity pro = c16918e3.pro();
                C14474e c14474e = new C14474e((InterfaceC8346e) c16918e3.f18866e.getValue());
                String valueOf = String.valueOf(((C12817e) obj2).ad);
                AbstractC13201e.vip(pro, c14474e, new C0086e(valueOf != null ? new C1703e(valueOf) : C2406e.ad, 0L, null, false, false, false, 126));
                return Unit.INSTANCE;
            case 14:
                C2464e c2464e = C2464e.appmetrica;
                C1390e c1390e = new C1390e((AudioTrack) obj2);
                c2464e.getClass();
                C2464e.metrica((AppActivity) obj3, c1390e);
                return Unit.INSTANCE;
            case 15:
                C3899e c3899e = (C3899e) obj2;
                if (((C11936e) ((C0909e) obj3).f3323e).get() == 0) {
                    c3899e.invoke();
                }
                return Unit.INSTANCE;
            case 16:
                ((Function0) obj3).invoke();
                ((InterfaceC3314e) obj2).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Function1) obj3).invoke((C14609e) obj2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((Function1) obj3).invoke(Integer.valueOf((int) ((C2616e) obj2).purchase()));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "Only found " + ((C3967e) obj3).f8852e + " digits in a row, but need to parse " + ((C13259e) obj2).vip();
            case 20:
                C4271e c4271e = (C4271e) obj3;
                C1789e c1789e = (C1789e) obj2;
                Activity activity = c4271e.f10582e;
                AppActivity appActivity = activity instanceof AppActivity ? (AppActivity) activity : null;
                if (appActivity != null) {
                    appActivity.isVip(new C15820e(c1789e.ad, 8, c1789e.vip, c1789e.metrica));
                }
                c4271e.purchase();
                return Unit.INSTANCE;
            case 21:
                C4271e c4271e2 = (C4271e) obj3;
                AbstractC16519e.vip((AppActivity) c4271e2.f10582e, new C4673e(c4271e2, (C2314e) obj2, null));
                return Unit.INSTANCE;
            case 22:
                String str3 = (String) obj3;
                C13458e c13458e = (C13458e) obj2;
                C6805e c6805e = C6805e.purchase;
                InterfaceC9998e[] interfaceC9998eArr = new InterfaceC9998e[0];
                if (AbstractC5304e.m1866native(str3)) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                if (c6805e.equals(C6805e.appmetrica)) {
                    throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                C7469e c7469e = new C7469e(str3);
                c7469e.vip = (List) c13458e.metrica;
                Unit unit = Unit.INSTANCE;
                return new C17709e(str3, c6805e, c7469e.metrica.size(), AbstractC1660e.m670implements(interfaceC9998eArr), c7469e);
            case 23:
                List list2 = (List) obj3;
                C15293e c15293e = (C15293e) obj2;
                ArrayList arrayList5 = new ArrayList(AbstractC0746e.subscription(list2, 10));
                Iterator it5 = list2.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(AbstractC6914e.billing((AudioTrack) it5.next()));
                }
                C13029e c13029e = new C13029e(arrayList5);
                int i4 = 6;
                C2946e c2946e = new C2946e(c15293e, i4);
                VKXApplication vKXApplication = VKXApplication.f36528e;
                if (vKXApplication == null) {
                    vKXApplication = null;
                }
                AbstractC5336e.purchase(vKXApplication, null, 0, new C1853e(c13029e, c2946e, objArr == true ? 1 : 0, i4), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return AbstractC12534e.mopub(2, (InterfaceC8850e) obj3, C5162e.f11047e, new C8086e(obj2, (InterfaceC5083e) (objArr2 == true ? 1 : 0), i3)).ad;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC5336e.purchase((InterfaceC18435e) obj3, null, 0, new C7236e(obj2, (InterfaceC5083e) (objArr3 == true ? 1 : 0), i2), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C8510e c8510e = (C8510e) obj3;
                c8510e.f17308e.setValue(Boolean.FALSE);
                c8510e.f17307e.advert((EnumC9603e) obj2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC5336e.purchase((InterfaceC18435e) obj3, null, 0, new C7236e(obj2, (InterfaceC5083e) (objArr4 == true ? 1 : 0), 4), 3);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C9013e c9013e = (C9013e) obj3;
                if (((Boolean) ((InterfaceC16132e) obj2).getValue()).booleanValue()) {
                    C14027e c14027e = C14027e.ad;
                    C14027e.metrica.applovin(C14027e.vip[0], Boolean.valueOf(!c14027e.vip()));
                    c9013e.f18078e.setValue(Boolean.valueOf(c14027e.vip()));
                } else {
                    new C9745e().signatures(c9013e.pro());
                }
                return Unit.INSTANCE;
            default:
                C14564e c14564e = (C14564e) obj3;
                C14505e c14505e = (C14505e) obj2;
                if (C11908e.appmetrica) {
                    C11908e.vip += 60;
                    C11908e.license += 60;
                }
                c14564e.m3830synchronized(c14505e.ad + 60);
                return Unit.INSTANCE;
        }
    }
}
