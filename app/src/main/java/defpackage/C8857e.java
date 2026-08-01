package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8857e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f17778e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f17779e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f17780e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f17781e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f17782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8857e(C12339e c12339e, EnumC6955e enumC6955e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f17778e = 26;
        this.f17781e = c12339e;
        this.f17779e = enumC6955e;
        this.f17780e = (AbstractC7185e) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8857e(C15062e c15062e, InterfaceC5083e interfaceC5083e, Object obj, Object obj2, int i) {
        super(2, interfaceC5083e);
        this.f17778e = i;
        this.f17781e = c15062e;
        this.f17779e = obj;
        this.f17780e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8857e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f17778e = i;
        this.f17780e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8857e(Object obj, Object obj2, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f17778e = i;
        this.f17779e = obj;
        this.f17780e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8857e(Object obj, Object obj2, Object obj3, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f17778e = i;
        this.f17781e = obj;
        this.f17779e = obj2;
        this.f17780e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r12.purchase(r11) == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (new defpackage.C15391e(r6, r7, r8, 8193).license(true, r11) == r4) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object ads(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f17781e
            eٍِؖ r0 = (defpackage.C9248e) r0
            int r1 = r11.f17782e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            defpackage.AbstractC2003e.purchase(r12)
            goto L51
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            defpackage.AbstractC2003e.purchase(r12)
            goto L43
        L20:
            defpackage.AbstractC2003e.purchase(r12)
            java.lang.Object r12 = r11.f17779e
            r7 = r12
            eْ٘ؒ r7 = (defpackage.C17713e) r7
            java.lang.Object r12 = r11.f17780e
            r6 = r12
            eؚٝۚ r6 = (defpackage.C7318e) r6
            eًؓؗ r8 = r0.f18457e
            r11.f17781e = r0
            r11.f17782e = r3
            eْ٘ؒ r12 = defpackage.AbstractC16588e.ad
            eُٕۘ r5 = new eُٕۘ
            r9 = 8193(0x2001, double:4.048E-320)
            r5.<init>(r6, r7, r8, r9)
            java.lang.Object r12 = r5.license(r3, r11)
            if (r12 != r4) goto L43
            goto L50
        L43:
            eًؓؗ r12 = r0.f18457e
            r0 = 0
            r11.f17781e = r0
            r11.f17782e = r2
            java.lang.Object r12 = r12.purchase(r11)
            if (r12 != r4) goto L51
        L50:
            return r4
        L51:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8857e.ads(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0096, code lost:
    
        if (defpackage.AbstractC13671e.metrica(r0, r9, r8) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object applovin(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f17779e
            eٍٙٚ r0 = (defpackage.InterfaceC9543e) r0
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r8.f17782e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            defpackage.AbstractC2003e.purchase(r9)
            goto L99
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            java.lang.Object r2 = r8.f17781e
            eٕٟؔ r2 = (defpackage.C15216e) r2
            defpackage.AbstractC2003e.purchase(r9)
            goto L84
        L25:
            defpackage.AbstractC2003e.purchase(r9)
            java.lang.Object r9 = r8.f17780e
            java.io.File r9 = (java.io.File) r9
            eُؚ۟ r2 = new eُؚ۟
            r5 = 10
            r2.<init>(r9, r0, r5)
            java.lang.Object r5 = defpackage.FileObserverC10859e.vip
            java.io.File r9 = r9.getParentFile()
            java.io.File r9 = r9.getCanonicalFile()
            java.lang.String r9 = r9.getPath()
            java.lang.Object r5 = defpackage.FileObserverC10859e.vip
            monitor-enter(r5)
            java.util.LinkedHashMap r6 = defpackage.FileObserverC10859e.metrica     // Catch: java.lang.Throwable -> L55
            java.lang.Object r7 = r6.get(r9)     // Catch: java.lang.Throwable -> L55
            if (r7 != 0) goto L57
            eُؚؑ r7 = new eُؚؑ     // Catch: java.lang.Throwable -> L55
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L55
            r6.put(r9, r7)     // Catch: java.lang.Throwable -> L55
            goto L57
        L55:
            r9 = move-exception
            goto L9c
        L57:
            eُؚؑ r7 = (defpackage.FileObserverC10859e) r7     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.CopyOnWriteArrayList r6 = r7.ad     // Catch: java.lang.Throwable -> L55
            r6.add(r2)     // Catch: java.lang.Throwable -> L55
            java.util.concurrent.CopyOnWriteArrayList r6 = r7.ad     // Catch: java.lang.Throwable -> L55
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L55
            if (r6 != r4) goto L69
            r7.startWatching()     // Catch: java.lang.Throwable -> L55
        L69:
            monitor-exit(r5)
            eٕٟؔ r5 = new eٕٟؔ
            r5.<init>(r9, r2, r4)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            r8.f17779e = r0
            r8.f17781e = r5
            r8.f17782e = r4
            r2 = r0
            eًٟؔ r2 = (defpackage.C2448e) r2
            eٖٓٞ r2 = r2.f6257e
            java.lang.Object r9 = r2.metrica(r8, r9)
            if (r9 != r1) goto L83
            goto L98
        L83:
            r2 = r5
        L84:
            eّۣۥ r9 = new eّۣۥ
            r4 = 29
            r9.<init>(r4, r2)
            r2 = 0
            r8.f17779e = r2
            r8.f17781e = r2
            r8.f17782e = r3
            java.lang.Object r9 = defpackage.AbstractC13671e.metrica(r0, r9, r8)
            if (r9 != r1) goto L99
        L98:
            return r1
        L99:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L9c:
            monitor-exit(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8857e.applovin(java.lang.Object):java.lang.Object");
    }

    private final Object inmobi(Object obj) {
        int i = this.f17782e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            AbstractC8797e abstractC8797e = ((C16066e) this.f17781e).ad;
            Uri uri = (Uri) this.f17779e;
            InputEvent inputEvent = (InputEvent) this.f17780e;
            this.f17782e = 1;
            Object appmetrica = abstractC8797e.appmetrica(uri, inputEvent, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (appmetrica == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    private final Object isPro(Object obj) {
        C12339e c12339e = (C12339e) this.f17781e;
        C0576e c0576e = c12339e.adcel;
        int i = this.f17782e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            c0576e.setValue(Boolean.TRUE);
            C10684e c10684e = c12339e.loadAd;
            C16822e c16822e = c12339e.amazon;
            EnumC6955e enumC6955e = (EnumC6955e) this.f17779e;
            ?? r7 = (AbstractC7185e) this.f17780e;
            this.f17782e = 1;
            c10684e.getClass();
            Object appmetrica = AbstractC9743e.appmetrica(new C13455e(enumC6955e, c10684e, r7, c16822e, null), this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (appmetrica == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        c0576e.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        if (r6.purchase(r17, r0) != r11) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [eؔۜؐ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object isVip(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8857e.isVip(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object signatures(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8857e.signatures(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0142, code lost:
    
        if (r0.mo325static(r3, r5, r25) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0183, code lost:
    
        if (r0.mo325static(r3, r5, r25) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01bd, code lost:
    
        if (r0.mo325static(r3, r5, r25) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01d8, code lost:
    
        if (r7 == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00bc, code lost:
    
        if (r0.mo325static(r3, r5, r25) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0215, code lost:
    
        if (r0.mo325static(r3, r5, r25) == r11) goto L31;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ef A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #6 {all -> 0x006f, blocks: (B:93:0x0068, B:96:0x00ec, B:136:0x00ef, B:139:0x00fa, B:140:0x00ff, B:155:0x00c4, B:158:0x00d2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ec A[Catch: all -> 0x006f, TryCatch #6 {all -> 0x006f, blocks: (B:93:0x0068, B:96:0x00ec, B:136:0x00ef, B:139:0x00fa, B:140:0x00ff, B:155:0x00c4, B:158:0x00d2), top: B:2:0x001a }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Class<eؓؔٝ>, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r5v7, types: [eؙّؔ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [eًؑۤ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object subscription(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8857e.subscription(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f17778e) {
            case 0:
                return new C8857e((C18237e) this.f17781e, (EnumC6955e) this.f17779e, (Function2) this.f17780e, interfaceC5083e, 0);
            case 1:
                C8857e c8857e = new C8857e(this.f17779e, (AbstractC16824e) this.f17780e, interfaceC5083e, 1);
                c8857e.f17781e = obj;
                return c8857e;
            case 2:
                return new C8857e((C15062e) this.f17781e, interfaceC5083e, (Map) this.f17779e, (EnumC13734e) this.f17780e, 2);
            case 3:
                return new C8857e((C15062e) this.f17781e, interfaceC5083e, (C11456e) this.f17779e, (Map) this.f17780e, 3);
            case 4:
                C8857e c8857e2 = new C8857e((C13750e) this.f17779e, (C4498e) this.f17780e, interfaceC5083e, 4);
                c8857e2.f17781e = obj;
                return c8857e2;
            case 5:
                C8857e c8857e3 = new C8857e((C4498e) this.f17779e, (C15208e) this.f17780e, interfaceC5083e, 5);
                c8857e3.f17781e = obj;
                return c8857e3;
            case 6:
                C8857e c8857e4 = new C8857e((Function3) this.f17779e, this.f17780e, interfaceC5083e, 6);
                c8857e4.f17781e = obj;
                return c8857e4;
            case 7:
                return new C8857e((InterfaceC8018e) this.f17781e, (Function3) this.f17779e, this.f17780e, interfaceC5083e, 7);
            case 8:
                return new C8857e((C12856e) this.f17781e, (C5033e) this.f17779e, (ClassLoader) this.f17780e, interfaceC5083e, 8);
            case 9:
                return new C8857e((C6064e) this.f17779e, (C12284e) this.f17780e, interfaceC5083e, 9);
            case 10:
                C8857e c8857e5 = new C8857e((C6572e) this.f17780e, interfaceC5083e, 10);
                c8857e5.f17779e = obj;
                return c8857e5;
            case 11:
                C8857e c8857e6 = new C8857e((C17399e) this.f17780e, interfaceC5083e, 11);
                c8857e6.f17779e = obj;
                return c8857e6;
            case 12:
                C8857e c8857e7 = new C8857e((C15274e) this.f17779e, (C13115e) this.f17780e, interfaceC5083e, 12);
                c8857e7.f17781e = obj;
                return c8857e7;
            case 13:
                C8857e c8857e8 = new C8857e((C12906e) this.f17779e, (InterfaceC6034e) this.f17780e, interfaceC5083e, 13);
                c8857e8.f17781e = obj;
                return c8857e8;
            case 14:
                return new C8857e((InterfaceC8850e) this.f17781e, (InterfaceC1108e) this.f17779e, (C10848e) this.f17780e, interfaceC5083e, 14);
            case 15:
                return new C8857e((C15274e) this.f17781e, (InterfaceC13352e) this.f17779e, (InterfaceC1232e) this.f17780e, interfaceC5083e, 15);
            case 16:
                return new C8857e((Context) this.f17781e, (C14826e) this.f17779e, (BroadcastReceiver.PendingResult) this.f17780e, interfaceC5083e, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C8857e((C14137e) this.f17780e, interfaceC5083e, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C8857e((C9302e) this.f17781e, (C12521e) this.f17779e, (C2109e) this.f17780e, interfaceC5083e, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C8857e c8857e9 = new C8857e((C5933e) this.f17780e, interfaceC5083e, 19);
                c8857e9.f17779e = obj;
                return c8857e9;
            case 20:
                C8857e c8857e10 = new C8857e((AudioTrack) this.f17780e, interfaceC5083e, 20);
                c8857e10.f17779e = obj;
                return c8857e10;
            case 21:
                return new C8857e((C0110e) this.f17781e, (InterfaceC6512e) this.f17779e, (C16446e) this.f17780e, interfaceC5083e, 21);
            case 22:
                return new C8857e((C12024e) this.f17779e, (String) this.f17780e, interfaceC5083e, 22);
            case 23:
                return new C8857e((String) this.f17781e, (File) this.f17779e, (Function2) this.f17780e, interfaceC5083e, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C8857e c8857e11 = new C8857e((C14478e) this.f17780e, interfaceC5083e, 24);
                c8857e11.f17779e = obj;
                return c8857e11;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C8857e((C16066e) this.f17781e, (Uri) this.f17779e, (InputEvent) this.f17780e, interfaceC5083e, 25);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C8857e((C12339e) this.f17781e, (EnumC6955e) this.f17779e, (Function2) this.f17780e, interfaceC5083e);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C8857e c8857e12 = new C8857e((File) this.f17780e, interfaceC5083e, 27);
                c8857e12.f17779e = obj;
                return c8857e12;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C8857e c8857e13 = new C8857e((C17713e) this.f17779e, (C7318e) this.f17780e, interfaceC5083e, 28);
                c8857e13.f17781e = obj;
                return c8857e13;
            default:
                return new C8857e((AbstractC16904e) this.f17781e, (C3177e) this.f17779e, (InterfaceC3314e) this.f17780e, interfaceC5083e, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17778e) {
            case 0:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C8857e) advert((InterfaceC5083e) obj2, (C9248e) obj)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 4:
                return ((C8857e) advert((InterfaceC5083e) obj2, (C16822e) obj)).loadAd(Unit.INSTANCE);
            case 5:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 6:
                return ((C8857e) advert((InterfaceC5083e) obj2, obj)).loadAd(Unit.INSTANCE);
            case 7:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 8:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 9:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 10:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 11:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 12:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 13:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 14:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 15:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 16:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C8857e) advert((InterfaceC5083e) obj2, (C5788e) obj)).loadAd(Unit.INSTANCE);
            case 20:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 21:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 22:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case 23:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C8857e) advert((InterfaceC5083e) obj2, (Float) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC9543e) obj)).loadAd(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C8857e) advert((InterfaceC5083e) obj2, (C9248e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C8857e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:296:0x0544, code lost:
    
        r10.putExtra("com.sec.android.app.Auto", 12);
        r12.sendBroadcast(r10);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0248 A[Catch: all -> 0x021b, TryCatch #11 {all -> 0x021b, blocks: (B:104:0x0215, B:106:0x0240, B:108:0x0248, B:109:0x0255, B:116:0x0265, B:118:0x0233, B:122:0x0268, B:126:0x026d, B:127:0x026e, B:128:0x026f, B:134:0x022e, B:111:0x0256, B:113:0x025c), top: B:100:0x0209, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026f A[Catch: all -> 0x021b, TRY_LEAVE, TryCatch #11 {all -> 0x021b, blocks: (B:104:0x0215, B:106:0x0240, B:108:0x0248, B:109:0x0255, B:116:0x0265, B:118:0x0233, B:122:0x0268, B:126:0x026d, B:127:0x026e, B:128:0x026f, B:134:0x022e, B:111:0x0256, B:113:0x025c), top: B:100:0x0209, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:431:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x07e9  */
    /* JADX WARN: Type inference failed for: r0v218 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82, types: [eؗۥؗ] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v9, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r1v133 */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v65, types: [eٗۥٚ] */
    /* JADX WARN: Type inference failed for: r1v68, types: [eٗۥٚ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [eٗۥٚ] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v71, types: [eَۖؐ] */
    /* JADX WARN: Type inference failed for: r2v73, types: [eٖٓٞ] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75, types: [eَۖؐ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:112:0x023d -> B:99:0x0240). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x0593 -> B:253:0x0492). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:281:0x0541 -> B:252:0x0544). Please report as a decompilation issue!!! */
    @Override // defpackage.AbstractC9049e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadAd(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8857e.loadAd(java.lang.Object):java.lang.Object");
    }
}
