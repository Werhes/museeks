package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۢۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2946e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15293e f6936e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6937e;

    public /* synthetic */ C2946e(C15293e c15293e, int i) {
        this.f6937e = i;
        this.f6936e = c15293e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f6937e;
        int i2 = 1;
        int i3 = 2;
        int i4 = 0;
        C15293e c15293e = this.f6936e;
        switch (i) {
            case 0:
                C12344e c12344e = (C12344e) c15293e.f30217e.f26730e;
                ArrayList arrayList = (ArrayList) c12344e.f24748e;
                ArrayList arrayList2 = (ArrayList) c12344e.f24753e;
                if (((C11268e) c12344e.f24751e) != null) {
                    int min = Math.min(((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                    int max = Math.max(((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue());
                    for (Object obj : ((C11268e) c12344e.f24751e).f11959e.purchase.subList(min, max)) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC6874e.Signature();
                            throw null;
                        }
                        AudioTrack audioTrack = (AudioTrack) obj;
                        if (!arrayList.contains(audioTrack)) {
                            arrayList.add(audioTrack);
                            arrayList2.add(Integer.valueOf(i4));
                        }
                        i4 = i5;
                    }
                    ((C11268e) c12344e.f24751e).f590e.license(min, max, null);
                    ((C15293e) c12344e.f24749e).m3925package();
                }
                return Unit.INSTANCE;
            case 1:
                C13465e c13465e = c15293e.f30217e;
                if (c13465e != null) {
                    C12344e c12344e2 = (C12344e) c13465e.f26730e;
                    new C18128e(new ArrayList((ArrayList) c12344e2.f24748e)).signatures((AppActivity) c15293e.f27451e);
                    Unit unit = Unit.INSTANCE;
                    c12344e2.Signature();
                }
                c15293e.m3926private();
                return Unit.INSTANCE;
            case 2:
                C13465e c13465e2 = c15293e.f30217e;
                if (c13465e2 != null) {
                    C12344e c12344e3 = (C12344e) c13465e2.f26730e;
                    ArrayList arrayList3 = new ArrayList((ArrayList) c12344e3.f24748e);
                    C7838e c7838e = VKXApplication.f36530e;
                    if (c7838e == null) {
                        c7838e = null;
                    }
                    c7838e.getClass();
                    if (!arrayList3.isEmpty()) {
                        c7838e.startapp(new C14078e(c7838e, (List) arrayList3, false, (InterfaceC5083e) null));
                    }
                    Unit unit2 = Unit.INSTANCE;
                    c12344e3.Signature();
                }
                AppActivity appActivity = (AppActivity) c15293e.pro();
                Integer valueOf = Integer.valueOf(R.drawable.ic_list_add_outline_28);
                VKXApplication vKXApplication = VKXApplication.f36528e;
                C9402e.ad(appActivity, new C15076e(valueOf, (vKXApplication != null ? vKXApplication : null).getString(R.string.play_next_ok), null, null, null, 84));
                c15293e.m3926private();
                return Unit.INSTANCE;
            case 3:
                C13465e c13465e3 = c15293e.f30217e;
                if (c13465e3 != null) {
                    C12344e c12344e4 = (C12344e) c13465e3.f26730e;
                    ArrayList arrayList4 = new ArrayList((ArrayList) c12344e4.f24748e);
                    C2464e c2464e = C2464e.appmetrica;
                    AppActivity appActivity2 = (AppActivity) c15293e.pro();
                    StringBuilder sb = new StringBuilder();
                    C14027e.ad.getClass();
                    sb.append(C14027e.metrica());
                    sb.append(arrayList4.hashCode());
                    AbstractC3002e abstractC3002e = new AbstractC3002e(sb.toString(), "Мультивыбор", arrayList4);
                    c2464e.getClass();
                    C2464e.metrica(appActivity2, abstractC3002e);
                    Unit unit3 = Unit.INSTANCE;
                    c12344e4.Signature();
                }
                c15293e.m3926private();
                return Unit.INSTANCE;
            case 4:
                C13465e c13465e4 = c15293e.f30217e;
                if (c13465e4 != null) {
                    C12344e c12344e5 = (C12344e) c13465e4.f26730e;
                    AbstractC2745e.vip(c15293e.pro(), new C5864e(2, new ArrayList((ArrayList) c12344e5.f24748e)));
                    Unit unit4 = Unit.INSTANCE;
                    c12344e5.Signature();
                }
                c15293e.m3926private();
                return Unit.INSTANCE;
            case 5:
                C13465e c13465e5 = c15293e.f30217e;
                if (c13465e5 != null) {
                    C12344e c12344e6 = (C12344e) c13465e5.f26730e;
                    new C5207e(c15293e, i2).invoke(new ArrayList((ArrayList) c12344e6.f24748e));
                    c12344e6.Signature();
                }
                c15293e.m3926private();
                return Unit.INSTANCE;
            case 6:
                AbstractC6232e.billing(C11383e.ad, AbstractC4608e.metrica(c15293e.f27449e));
                return Unit.INSTANCE;
            case 7:
                return new C17954e(c15293e.f30220e, false, new C5207e(c15293e, i3));
            default:
                return new C1423e(c15293e, 46);
        }
    }
}
