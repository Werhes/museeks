package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11476e extends C7460e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f23079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11476e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f23079e = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AppActivity appActivity;
        int i;
        Integer valueOf;
        boolean z;
        float purchase;
        int i2 = 4;
        int i3 = 19;
        int i4 = 3;
        InterfaceC5083e interfaceC5083e = null;
        int i5 = 2;
        int i6 = 0;
        switch (this.f23079e) {
            case 0:
                ((C0139e) this.f7266e).getClass();
                if (AbstractC7890e.billing(((Uri) obj).getQueryParameter("act"), "buy_music_subscription") && (appActivity = C5658e.vip) != null) {
                    new C17180e(R.string.library_vkm_sub_upsell, R.string.library_vkm_sub_upsell_text, R.string.library_vkm_sub_upsell_act, null, null, new C12851e(17, appActivity), null, 360).signatures(appActivity);
                }
                return Unit.INSTANCE;
            case 1:
                String str = (String) obj;
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity2 = C5658e.vip;
                if (appActivity2 != null) {
                    appActivity2.isVip(new C15767e(new C9837e(str, i6)));
                }
                return Unit.INSTANCE;
            case 2:
                String str2 = (String) obj;
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity3 = C5658e.vip;
                if (appActivity3 != null) {
                    appActivity3.isVip(new C15767e(new C9837e(str2, i6)));
                }
                return Unit.INSTANCE;
            case 3:
                String str3 = (String) obj;
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity4 = C5658e.vip;
                if (appActivity4 != null) {
                    appActivity4.isVip(new C5522e(str3));
                }
                return Unit.INSTANCE;
            case 4:
                AbstractC14297e abstractC14297e = (AbstractC14297e) ((C12329e) this.f7266e).ad.get();
                if (abstractC14297e != null) {
                    C16981e yandex = abstractC14297e.yandex();
                    yandex.f33289e.ad = new C17900e(yandex.f33290e, ((C14918e) yandex.f33291e.f22047e).appmetrica.values());
                }
                return Unit.INSTANCE;
            case 5:
                ((Boolean) obj).getClass();
                ((C1856e) this.f7266e).getClass();
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e == null) {
                    c7838e = null;
                }
                c7838e.getClass();
                AbstractC5336e.purchase(c7838e, null, 0, new C12559e(i5, i3, interfaceC5083e), 3);
                return Unit.INSTANCE;
            case 6:
                ((Boolean) obj).getClass();
                ((C1856e) this.f7266e).getClass();
                C7838e c7838e2 = VKXApplication.f36530e;
                if (c7838e2 == null) {
                    c7838e2 = null;
                }
                c7838e2.getClass();
                AbstractC5336e.purchase(c7838e2, null, 0, new C12559e(i5, i3, interfaceC5083e), 3);
                return Unit.INSTANCE;
            case 7:
                ((Boolean) obj).getClass();
                ((C1856e) this.f7266e).getClass();
                C7838e c7838e3 = VKXApplication.f36530e;
                if (c7838e3 == null) {
                    c7838e3 = null;
                }
                c7838e3.getClass();
                AbstractC5336e.purchase(c7838e3, null, 0, new C12559e(i5, i3, interfaceC5083e), 3);
                return Unit.INSTANCE;
            case 8:
                C10794e c10794e = (C10794e) obj;
                C9167e c9167e = ((C14947e) this.f7266e).f29633e;
                C1343e c1343e = c9167e.vip;
                if (c1343e == null) {
                    c1343e = (C1343e) C14947e.f29630e.getValue();
                }
                C6351e ad = c1343e.ad();
                ad.ad = new C11980e(8);
                c9167e.ad.invoke(ad);
                if (c10794e != null) {
                    Long l = c10794e.vip;
                    if (l != null) {
                        long longValue = l.longValue();
                        int i7 = AbstractC4173e.ad;
                        if (longValue == Long.MAX_VALUE) {
                            longValue = 0;
                        }
                        ad.inmobi = AbstractC16286e.vip(longValue, TimeUnit.MILLISECONDS);
                    }
                    Long l2 = c10794e.metrica;
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        int i8 = AbstractC4173e.ad;
                        long j = longValue2 == Long.MAX_VALUE ? 0L : longValue2;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        ad.isPro = AbstractC16286e.vip(j, timeUnit);
                        ad.applovin = AbstractC16286e.vip(longValue2 != Long.MAX_VALUE ? longValue2 : 0L, timeUnit);
                    }
                }
                return new C1343e(ad);
            case 9:
                return ((C17681e) this.f7266e).ad.get(obj);
            case 10:
                return Boolean.valueOf(((InterfaceC10471e) this.f7266e).test(obj));
            case 11:
                ((C14378e) this.f7266e).getClass();
                return Boolean.TRUE;
            case 12:
                ((C9289e) this.f7266e).startapp.subscription((String) obj);
                return Unit.INSTANCE;
            case 13:
                ((C1925e) this.f7266e).yandex.subscription((String) obj);
                return Unit.INSTANCE;
            case 14:
                return Boolean.valueOf(((InterfaceC8346e) this.f7266e).contains((String) obj));
            case 15:
                ((C9289e) this.f7266e).vip.invoke((C11973e) obj);
                return Unit.INSTANCE;
            case 16:
                C12979e.isPro((C12979e) this.f7266e, (C11973e) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return Boolean.valueOf(((InterfaceC8346e) this.f7266e).contains((String) obj));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C4837e) this.f7266e).appmetrica.invoke((C11973e) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C12979e.isPro((C12979e) this.f7266e, (C11973e) obj);
                return Unit.INSTANCE;
            case 20:
                ((C14564e) this.f7266e).m3828return(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 21:
                ((Boolean) obj).getClass();
                C12688e.m3377private((C12688e) this.f7266e);
                return Unit.INSTANCE;
            case 22:
                ((Boolean) obj).getClass();
                Activity pro = ((C12688e) this.f7266e).pro();
                AbstractC15615e.ad(new Celse(pro, new C15076e(null, pro.getString(R.string.notification), pro.getString(R.string.restart_prompt), new C6571e(pro.getString(R.string.restart_act), new C0743e(i4)), null, 113), i2));
                return Unit.INSTANCE;
            case 23:
                ((Boolean) obj).getClass();
                C12688e.m3377private((C12688e) this.f7266e);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((Boolean) obj).getClass();
                C12688e.m3377private((C12688e) this.f7266e);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C11800e) this.f7266e).startapp((String) obj);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                PlaybackService playbackService = (PlaybackService) this.f7266e;
                int i9 = PlaybackService.f36732e;
                playbackService.m4747class((Boolean) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return PlaybackService.metrica((PlaybackService) this.f7266e, (InterfaceC5083e) obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                List<AbstractC2799e> list = (List) obj;
                ((C15682e) this.f7266e).getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((AbstractC2799e) obj2) instanceof C2795e) {
                        arrayList.add(obj2);
                    }
                }
                list.removeAll(arrayList);
                Iterator it = AbstractC13480e.m3607transient(arrayList).iterator();
                while (it.hasNext()) {
                    list.add(0, (AbstractC2799e) it.next());
                }
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (((AbstractC2799e) listIterator.previous()) instanceof C17389e) {
                        i = listIterator.nextIndex();
                    }
                }
                if (i > 0) {
                    C17389e c17389e = (C17389e) list.get(i);
                    for (int i10 = 0; i10 < i; i10++) {
                        AbstractC2799e abstractC2799e = (AbstractC2799e) list.remove(0);
                        C8823e c8823e = abstractC2799e instanceof C14088e ? ((C14088e) abstractC2799e).vip : abstractC2799e instanceof C17389e ? ((C17389e) abstractC2799e).ad : null;
                        if (c8823e != null) {
                            c17389e.ad.mo692else(new C6846e(29, c8823e));
                        }
                        if (abstractC2799e instanceof C6504e) {
                            ((C6504e) abstractC2799e).ad.ad(null);
                        }
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i11 = 0;
                for (AbstractC2799e abstractC2799e2 : list) {
                    int i12 = i11 + 1;
                    if (abstractC2799e2 instanceof C6504e) {
                        C6504e c6504e = (C6504e) abstractC2799e2;
                        String str4 = c6504e.ad.ad;
                        Set m3582e = AbstractC13480e.m3582e(AbstractC13480e.m3572catch(new C5060e(str4), c6504e.vip));
                        int size = list.size();
                        for (int i13 = i12; i13 < size; i13++) {
                            AbstractC2799e abstractC2799e3 = (AbstractC2799e) list.get(i13);
                            if (abstractC2799e3 instanceof C14088e) {
                                z = m3582e.contains(new C5060e(((C14088e) abstractC2799e3).ad));
                            } else {
                                if (abstractC2799e3 instanceof C6504e) {
                                    C6504e c6504e2 = (C6504e) abstractC2799e3;
                                    String str5 = c6504e2.ad.ad;
                                    Set m3582e2 = AbstractC13480e.m3582e(AbstractC13480e.m3572catch(new C5060e(str5), c6504e2.vip));
                                    if (AbstractC7890e.billing(str4, str5) || !m3582e.equals(m3582e2)) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (z) {
                                valueOf = Integer.valueOf(i13);
                            }
                        }
                        valueOf = null;
                    } else {
                        if (abstractC2799e2 instanceof C14088e) {
                            int size2 = list.size();
                            for (int i14 = i12; i14 < size2; i14++) {
                                AbstractC2799e abstractC2799e4 = (AbstractC2799e) list.get(i14);
                                if ((abstractC2799e4 instanceof C14088e) && AbstractC7890e.billing(((C14088e) abstractC2799e4).ad, ((C14088e) abstractC2799e2).ad)) {
                                    valueOf = Integer.valueOf(i14);
                                }
                            }
                        }
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        AbstractC2799e abstractC2799e5 = (AbstractC2799e) list.get(valueOf.intValue());
                        Log.d("CXCP", abstractC2799e2 + " is pruned by " + abstractC2799e5);
                        linkedHashSet.add(Integer.valueOf(i11));
                        if ((abstractC2799e2 instanceof C14088e) && (abstractC2799e5 instanceof C14088e)) {
                            ((C14088e) abstractC2799e5).vip.mo692else(new C13749e(i6, (C14088e) abstractC2799e2));
                        }
                    }
                    i11 = i12;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = AbstractC13480e.m3598return(linkedHashSet).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(list.remove(((Number) it2.next()).intValue() - arrayList2.size()));
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    AbstractC2799e abstractC2799e6 = (AbstractC2799e) it3.next();
                    if (abstractC2799e6 instanceof C6504e) {
                        ((C6504e) abstractC2799e6).ad.ad(null);
                    }
                }
                return Unit.INSTANCE;
            default:
                float floatValue = ((Number) obj).floatValue();
                C8933e c8933e = (C8933e) this.f7266e;
                boolean vip = c8933e.vip();
                C2616e c2616e = c8933e.purchase;
                C2616e c2616e2 = c8933e.billing;
                if (!vip) {
                    float purchase2 = c2616e.purchase() + floatValue;
                    if (purchase2 < 0.0f) {
                        purchase2 = 0.0f;
                    }
                    float purchase3 = purchase2 - c2616e.purchase();
                    c2616e.startapp(purchase2);
                    if (c8933e.ad() <= c2616e2.purchase()) {
                        purchase = c8933e.ad();
                    } else {
                        float abs = Math.abs(c8933e.ad() / c2616e2.purchase()) - 1.0f;
                        r8 = abs >= 0.0f ? abs : 0.0f;
                        if (r8 > 2.0f) {
                            r8 = 2.0f;
                        }
                        purchase = (c2616e2.purchase() * (r8 - (((float) Math.pow(r8, 2)) / 4))) + c2616e2.purchase();
                    }
                    c8933e.appmetrica.startapp(purchase);
                    r8 = purchase3;
                }
                return Float.valueOf(r8);
        }
    }
}
