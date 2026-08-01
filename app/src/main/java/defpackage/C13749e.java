package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.activity.ShortcutBridgeActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13749e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f27233e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27234e;

    public /* synthetic */ C13749e(int i, Object obj) {
        this.f27234e = i;
        this.f27233e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C13749e(Function2 function2) {
        this.f27234e = 14;
        this.f27233e = (AbstractC7185e) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        Object[] objArr5 = 0;
        switch (this.f27234e) {
            case 0:
                C8823e c8823e = ((C14088e) this.f27233e).vip;
                Unit unit = Unit.INSTANCE;
                c8823e.m2175import(unit);
                return unit;
            case 1:
                ((C14137e) ((C15682e) this.f27233e).appmetrica.f36189e).amazon(new C2795e((C15458e) obj));
                return Unit.INSTANCE;
            case 2:
                ((C12718e) ((C18464e) this.f27233e).f36194e).addLast(obj);
                return Unit.INSTANCE;
            case 3:
                C10122e c10122e = (C10122e) obj;
                c10122e.signatures(((C8933e) this.f27233e).appmetrica.purchase() - Float.intBitsToFloat((int) (4294967295L & c10122e.f19998e)));
                return Unit.INSTANCE;
            case 4:
                InterfaceC14468e interfaceC14468e = (InterfaceC14468e) this.f27233e;
                InterfaceC15671e interfaceC15671e = (InterfaceC15671e) obj;
                if (interfaceC14468e.invoke() > 0.0f) {
                    AbstractC14594e.mopub(interfaceC15671e, new C0196e(interfaceC14468e.invoke(), new C3721e(0.0f, 1.0f), 0));
                }
                return Unit.INSTANCE;
            case 5:
                C16780e c16780e = (C16780e) this.f27233e;
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) obj;
                if (c16780e.ad != ((int) (interfaceC0043e.advert() & 4294967295L))) {
                    c16780e.ad = (int) (4294967295L & interfaceC0043e.advert());
                }
                return Unit.INSTANCE;
            case 6:
                C5769e c5769e = (C5769e) this.f27233e;
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-797765402, true, new C18322e(c5769e, objArr2 == true ? 1 : 0)), 3);
                List list = (List) c5769e.f12195e.getValue();
                c17213e.mopub(list.size(), null, new C7976e(list, c == true ? 1 : 0, objArr == true ? 1 : 0), new C2892e(802480018, true, new C4290e(list, c5769e, 22)));
                AbstractC5087e.premium(c17213e, null, null, AbstractC13281e.yandex, 3);
                return Unit.INSTANCE;
            case 7:
                C17532e c17532e = (C17532e) this.f27233e;
                AbstractC5336e.purchase(c17532e, null, 0, new C8086e((AudioTrack) obj, c17532e, objArr5 == true ? 1 : 0, 24), 3);
                return Unit.INSTANCE;
            case 8:
                ((C17489e) this.f27233e).isPro(obj);
                return Unit.INSTANCE;
            case 9:
                C8574e c8574e = (C8574e) this.f27233e;
                Throwable th = (Throwable) obj;
                CancellationException ad = AbstractC7070e.ad("Recomposer effect job completed", th);
                synchronized (c8574e.license) {
                    try {
                        InterfaceC10500e interfaceC10500e = c8574e.appmetrica;
                        if (interfaceC10500e != null) {
                            C1615e c1615e = c8574e.tapsense;
                            EnumC18411e enumC18411e = EnumC18411e.f36095e;
                            c1615e.getClass();
                            c1615e.smaato(null, enumC18411e);
                            interfaceC10500e.Signature(ad);
                            c8574e.remoteconfig = null;
                            interfaceC10500e.mo692else(new C6538e(c8574e, th, c2 == true ? 1 : 0));
                        } else {
                            c8574e.purchase = ad;
                            C1615e c1615e2 = c8574e.tapsense;
                            EnumC18411e enumC18411e2 = EnumC18411e.f36097e;
                            c1615e2.getClass();
                            c1615e2.smaato(null, enumC18411e2);
                            Unit unit2 = Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return Unit.INSTANCE;
            case 10:
                ((InputConnectionC10217e) this.f27233e).ad((InterfaceC5366e) obj);
                return Unit.INSTANCE;
            case 11:
                InterfaceC12163e interfaceC12163e = (InterfaceC12163e) this.f27233e;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj;
                if (!(interfaceC3314e instanceof InterfaceC16595e)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                InterfaceC16595e interfaceC16595e = (InterfaceC16595e) interfaceC3314e;
                return new C0576e(interfaceC16595e.getValue() != null ? interfaceC12163e.startapp(interfaceC16595e.getValue()) : null, interfaceC16595e.vip());
            case 12:
                C17138e.metrica((InterfaceC2235e) obj, (C16446e) this.f27233e);
                return Unit.INSTANCE;
            case 13:
                C17138e.metrica((InterfaceC2235e) obj, ((C12988e) this.f27233e).billing);
                return Unit.INSTANCE;
            case 14:
                C11997e c11997e = (C11997e) ((InterfaceC9215e) obj);
                c11997e.f23981e.add((AbstractC7185e) this.f27233e);
                c11997e.f23977e = null;
                return Unit.INSTANCE;
            case 15:
                C11997e c11997e2 = (C11997e) ((InterfaceC9215e) obj);
                c11997e2.f23981e.add((C15686e) this.f27233e);
                c11997e2.f23977e = null;
                return Unit.INSTANCE;
            case 16:
                InterfaceC5039e interfaceC5039e = ((C10304e) this.f27233e).f20353e;
                return Boolean.valueOf(interfaceC5039e != null ? interfaceC5039e.metrica(obj) : true);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C9137e c9137e = (C9137e) this.f27233e;
                float floatValue = ((Float) obj).floatValue();
                C16330e c16330e = c9137e.ad;
                float purchase = c16330e.purchase() + floatValue + c9137e.purchase;
                float vip = AbstractC3062e.vip(purchase, 0.0f, c9137e.appmetrica.purchase());
                Object[] objArr6 = purchase == vip ? 1 : null;
                float purchase2 = vip - c16330e.purchase();
                int round = Math.round(purchase2);
                c16330e.startapp(c16330e.purchase() + round);
                c9137e.purchase = purchase2 - round;
                if (objArr6 == null) {
                    floatValue = purchase2;
                }
                return Float.valueOf(floatValue);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C11950e c11950e = (C11950e) this.f27233e;
                return new C2152e(c11950e.metrica(c11950e.mopub, ((C2152e) obj).ad, c11950e.adcel));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C9456e) this.f27233e).amazon.setValue((String) obj);
                return Unit.INSTANCE;
            case 20:
                C16818e c16818e = (C16818e) this.f27233e;
                if (!((EnumC16488e) obj).vip()) {
                    c16818e.vip.crashlytics(-1);
                }
                return Unit.INSTANCE;
            case 21:
                C2401e c2401e = (C2401e) obj;
                if (((InterfaceC18191e) this.f27233e).ad(c2401e.metrica)) {
                    c2401e.ad();
                }
                return Unit.INSTANCE;
            case 22:
                C9302e c9302e = (C9302e) this.f27233e;
                if (((C4395e) obj).purchase.ad.ad.f20850e.length() > 0) {
                    c9302e.f18534e = false;
                }
                return Unit.INSTANCE;
            case 23:
                ((InterfaceC10500e) this.f27233e).Signature(null);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C4834e c4834e = (C4834e) this.f27233e;
                AbstractC11110e abstractC11110e = c4834e.metrica;
                ((C17213e) obj).mopub(abstractC11110e.subs(), null, new C7976e(abstractC11110e, 9, objArr4 == true ? 1 : 0), new C2892e(802480018, true, new C4290e(abstractC11110e, c4834e, objArr3 == true ? 1 : 0)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ShortcutBridgeActivity shortcutBridgeActivity = (ShortcutBridgeActivity) this.f27233e;
                int i = ShortcutBridgeActivity.f36550e;
                List list2 = (List) ((VKResponseWithItems) obj).ad;
                if (list2 == null) {
                    return Unit.INSTANCE;
                }
                shortcutBridgeActivity.vip(new C14474e(list2));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                try {
                    Runtime.getRuntime().removeShutdownHook((C13323e) this.f27233e);
                } catch (IllegalStateException unused) {
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C5318e c5318e = (C5318e) this.f27233e;
                InterfaceC15080e interfaceC15080e = c5318e.purchase;
                if (!AbstractC7890e.billing(interfaceC15080e, interfaceC15080e)) {
                    AbstractC6536e.vip("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                C12618e c12618e = c5318e.appmetrica;
                Object obj2 = c5318e.metrica;
                if (c12618e != null) {
                    if (obj2 != null) {
                        AbstractC6536e.vip("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    c12618e.ad(obj);
                } else if (obj2 == null) {
                    c5318e.metrica = obj;
                } else {
                    C12618e c12618e2 = AbstractC1710e.ad;
                    C12618e c12618e3 = new C12618e();
                    c12618e3.ad(obj2);
                    c12618e3.ad(obj);
                    c5318e.appmetrica = c12618e3;
                    c5318e.metrica = null;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6029e c6029e = (C6029e) this.f27233e;
                C17213e c17213e2 = (C17213e) obj;
                AbstractC5087e.premium(c17213e2, null, null, AbstractC14385e.license, 3);
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(-1901994032, true, new C12756e(c6029e, c3 == true ? 1 : 0)), 3);
                AbstractC5087e.premium(c17213e2, null, null, AbstractC14385e.purchase, 3);
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(983252622, true, new C12756e(c6029e, 2)), 3);
                return Unit.INSTANCE;
            default:
                return Boolean.valueOf(AbstractC7890e.billing(((C17932e) obj).ad, (C18362e) this.f27233e));
        }
    }
}
