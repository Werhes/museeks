package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17237e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public List f33769e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ List f33770e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ List f33771e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f33772e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ List f33773e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ C12810e f33774e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public List f33775e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public List f33776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17237e(C12810e c12810e, List list, List list2, List list3, InterfaceC5083e interfaceC5083e) {
        super(1, interfaceC5083e);
        this.f33774e = c12810e;
        this.f33771e = list;
        this.f33773e = list2;
        this.f33770e = list3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C17237e) mopub((InterfaceC5083e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        List list;
        List list2;
        List list3;
        int i = this.f33772e;
        try {
            if (i == 0) {
                AbstractC2003e.purchase(obj);
                if (AbstractC9464e.smaato("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#update3aRegions");
                }
                C12810e c12810e = this.f33774e;
                list = this.f33771e;
                List list4 = this.f33773e;
                List list5 = this.f33770e;
                C12701e ad = c12810e.metrica.ad();
                this.f33769e = list;
                this.f33776e = list4;
                this.f33775e = list5;
                this.f33772e = 1;
                obj = ad.ad(this);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (obj == enumC2821e) {
                    return enumC2821e;
                }
                list2 = list4;
                list3 = list5;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list3 = this.f33775e;
                list2 = this.f33776e;
                list = this.f33769e;
                AbstractC2003e.purchase(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                C15154e c15154e = (C15154e) autoCloseable;
                if (list == null) {
                    list = Arrays.asList(AbstractC8806e.ad);
                }
                List list6 = list;
                if (list2 == null) {
                    list2 = Arrays.asList(AbstractC8806e.ad);
                }
                List list7 = list2;
                if (list3 == null) {
                    list3 = Arrays.asList(AbstractC8806e.ad);
                }
                InterfaceC1908e firebase = AbstractC17861e.firebase(c15154e, null, null, null, list6, list7, list3, 7);
                AbstractC18453e.ad(autoCloseable, null);
                return firebase;
            } finally {
            }
        } catch (CancellationException e) {
            if (AbstractC9464e.smaato("CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return C12810e.advert;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        return new C17237e(this.f33774e, this.f33771e, this.f33773e, this.f33770e, interfaceC5083e);
    }
}
