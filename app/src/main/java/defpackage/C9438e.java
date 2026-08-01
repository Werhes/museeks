package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9438e implements InterfaceC0077e {
    public final /* synthetic */ int ad;
    public final C17651e appmetrica;
    public InterfaceC10500e license;
    public final C14826e metrica;
    public final ArrayList purchase;
    public final C11817e vip;

    public C9438e(int i) {
        this.ad = i;
        switch (i) {
            case 1:
                this.vip = AbstractC7763e.ad(new C2091e(7));
                C14826e vip = AbstractC9743e.vip();
                this.metrica = new C14826e(vip.f29359e.mo394const(new C5621e("DelayedAnalyticsFacade-VKPodcasts")));
                this.appmetrica = AbstractC12751e.ad();
                this.purchase = new ArrayList();
                return;
            default:
                this.vip = AbstractC7763e.ad(new C2091e(3));
                C14826e vip2 = AbstractC9743e.vip();
                this.metrica = new C14826e(vip2.f29359e.mo394const(new C5621e("DelayedAnalyticsFacade-VK")));
                this.appmetrica = AbstractC12751e.ad();
                this.purchase = new ArrayList();
                return;
        }
    }

    public static String adcel(String str) {
        List m1869private = AbstractC5304e.m1869private(str, new String[]{"_"}, 6);
        if (m1869private.size() != 3) {
            m1869private = null;
        }
        if (m1869private != null) {
            String str2 = ((String) m1869private.get(0)) + '_' + ((String) m1869private.get(1));
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    public static C4030e advert(String str, C4532e c4532e, C4532e c4532e2, String str2) {
        String billing;
        String str3;
        C13935e c13935e = new C13935e(15);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c13935e.f27641e;
        AbstractC10681e.purchase(c13935e, "e", str);
        C14609e c14609e = c4532e.ad;
        long j = c4532e.license;
        AbstractC16049e abstractC16049e = c14609e != null ? c14609e.vip : null;
        AudioTrack audioTrack = abstractC16049e instanceof AudioTrack ? (AudioTrack) abstractC16049e : null;
        AbstractC10681e.purchase(c13935e, "audio_id", audioTrack != null ? AbstractC6914e.billing(audioTrack) : null);
        AbstractC10681e.appmetrica(c13935e, "uuid", Integer.valueOf(UUID.randomUUID().hashCode()));
        Boolean bool = Boolean.FALSE;
        C5404e c5404e = AbstractC12517e.ad;
        AbstractC10681e.purchase(c13935e, "reason", str2);
        AbstractC10681e.appmetrica(c13935e, "start_time", Long.valueOf(c4532e.metrica));
        AbstractC10681e.appmetrica(c13935e, "playback_started_at", Long.valueOf(j));
        AbstractC16049e abstractC16049e2 = c14609e != null ? c14609e.vip : null;
        AudioTrack audioTrack2 = abstractC16049e2 instanceof AudioTrack ? (AudioTrack) abstractC16049e2 : null;
        if (audioTrack2 != null && (str3 = audioTrack2.startapp) != null) {
            if (AbstractC5304e.m1866native(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                AbstractC10681e.purchase(c13935e, "track_code", str3);
            }
        }
        AbstractC10681e.purchase(c13935e, "streaming_type", "online");
        AbstractC10681e.appmetrica(c13935e, "duration", Long.valueOf(j));
        AbstractC10681e.purchase(c13935e, "repeat", "all");
        AbstractC10681e.purchase(c13935e, "state", "app");
        InterfaceC1686e interfaceC1686e = c4532e.vip;
        if (interfaceC1686e instanceof C17922e) {
            AbstractC10681e.purchase(c13935e, "source", ((C17922e) interfaceC1686e).appmetrica);
        } else if (interfaceC1686e instanceof C16482e) {
            AbstractC10681e.purchase(c13935e, "source", "other");
            AbstractC10681e.purchase(c13935e, "playlist_id", adcel(((C16482e) interfaceC1686e).appmetrica));
        } else {
            AbstractC10681e.purchase(c13935e, "source", "other");
        }
        if (c4532e2 != null) {
            C14609e c14609e2 = c4532e2.ad;
            InterfaceC1686e interfaceC1686e2 = c4532e2.vip;
            if (interfaceC1686e2 instanceof C16482e) {
                AbstractC10681e.purchase(c13935e, "prev_playlist_id", adcel(((C16482e) interfaceC1686e2).appmetrica));
            }
            if (c14609e2 != null && !c14609e2.equals(c14609e)) {
                AbstractC16049e abstractC16049e3 = c14609e2.vip;
                AudioTrack audioTrack3 = abstractC16049e3 instanceof AudioTrack ? (AudioTrack) abstractC16049e3 : null;
                if (audioTrack3 != null && (billing = AbstractC6914e.billing(audioTrack3)) != null) {
                    AbstractC10681e.purchase(c13935e, "prev_audio_id", billing);
                }
            }
        }
        return new C4030e(linkedHashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(4:21|(4:23|24|25|(1:27))|15|16)|11|12|(1:14)|15|16))|30|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r6 = new defpackage.C12763e(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object billing(defpackage.C9438e r4, java.util.ArrayList r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C5743e
            if (r0 == 0) goto L13
            r0 = r6
            eؘٛٗ r0 = (defpackage.C5743e) r0
            int r1 = r0.f12169e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12169e = r1
            goto L18
        L13:
            eؘٛٗ r0 = new eؘٛٗ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12168e
            int r1 = r0.f12169e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L76
            goto L73
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L82
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.addAll(r5)
            eًًٖ r5 = new eًًٖ
            r5.<init>(r6)
            eًۛ۠ r6 = defpackage.AbstractC1831e.vip()     // Catch: java.lang.Throwable -> L76
            eِٙٙ r4 = r4.vip     // Catch: java.lang.Throwable -> L76
            r4.getClass()     // Catch: java.lang.Throwable -> L76
            eٌٗۛ r1 = defpackage.C7960e.Companion     // Catch: java.lang.Throwable -> L76
            eؘؒٙ r1 = r1.serializer()     // Catch: java.lang.Throwable -> L76
            eؘؒٙ r1 = (defpackage.InterfaceC5372e) r1     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r4.purchase(r1, r5)     // Catch: java.lang.Throwable -> L76
            r0.f12169e = r2     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "stats.trackEvents"
            eؘُٛ r1 = new eؘُٛ     // Catch: java.lang.Throwable -> L76
            eٕؗۜ r3 = defpackage.C5170e.f11062e     // Catch: java.lang.Throwable -> L76
            r1.<init>(r5, r3)     // Catch: java.lang.Throwable -> L76
            r1.appmetrica = r2     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "events"
            r1.ad(r5, r4)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r6.license(r1, r0)     // Catch: java.lang.Throwable -> L76
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r6 != r4) goto L73
            return r4
        L73:
            eٍؒۢ r6 = (defpackage.AbstractC9200e) r6     // Catch: java.lang.Throwable -> L76
            goto L7c
        L76:
            r4 = move-exception
            eّۜۖ r6 = new eّۜۖ
            r6.<init>(r4)
        L7c:
            boolean r4 = r6 instanceof defpackage.C12763e
            if (r4 != 0) goto L82
            eٍؒۢ r6 = (defpackage.AbstractC9200e) r6
        L82:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9438e.billing(eٍّ۠, java.util.ArrayList, eُؑ۠):java.lang.Object");
    }

    public static C4030e mopub(C4532e c4532e, C4532e c4532e2, String str) {
        String str2;
        C13935e c13935e = new C13935e(15);
        LinkedHashMap linkedHashMap = (LinkedHashMap) c13935e.f27641e;
        AbstractC10681e.purchase(c13935e, "e", "podcast_play");
        C14609e c14609e = c4532e.ad;
        AbstractC16049e abstractC16049e = c14609e != null ? c14609e.vip : null;
        AudioTrack audioTrack = abstractC16049e instanceof AudioTrack ? (AudioTrack) abstractC16049e : null;
        AbstractC10681e.purchase(c13935e, "audio_id", audioTrack != null ? AbstractC6914e.billing(audioTrack) : null);
        AbstractC16049e abstractC16049e2 = c14609e != null ? c14609e.vip : null;
        AudioTrack audioTrack2 = abstractC16049e2 instanceof AudioTrack ? (AudioTrack) abstractC16049e2 : null;
        AbstractC10681e.appmetrica(c13935e, "duration", Integer.valueOf(audioTrack2 != null ? audioTrack2.appmetrica : 0));
        AbstractC10681e.appmetrica(c13935e, "play_rate", 1);
        Boolean bool = Boolean.FALSE;
        C5404e c5404e = AbstractC12517e.ad;
        AbstractC10681e.purchase(c13935e, "action", str);
        long j = c4532e.license;
        AbstractC16049e abstractC16049e3 = c14609e != null ? c14609e.vip : null;
        long j2 = (abstractC16049e3 instanceof AudioTrack ? (AudioTrack) abstractC16049e3 : null) != null ? r8.appmetrica : 0L;
        if (j > j2) {
            j = j2;
        }
        AbstractC10681e.appmetrica(c13935e, "position", Long.valueOf(j));
        if (c4532e2 != null && str.equals("seek")) {
            AbstractC10681e.appmetrica(c13935e, "position_from", Long.valueOf(c4532e2.license));
        }
        AbstractC16049e abstractC16049e4 = c14609e != null ? c14609e.vip : null;
        AudioTrack audioTrack3 = abstractC16049e4 instanceof AudioTrack ? (AudioTrack) abstractC16049e4 : null;
        if (audioTrack3 != null && (str2 = audioTrack3.startapp) != null) {
            String str3 = AbstractC5304e.m1866native(str2) ? null : str2;
            if (str3 != null) {
                AbstractC10681e.purchase(c13935e, "track_code", str3);
            }
        }
        AbstractC10681e.purchase(c13935e, "ref", "episode");
        AbstractC10681e.purchase(c13935e, "source", "icon_button");
        return new C4030e(linkedHashMap);
    }

    public static String startapp(EnumC15342e enumC15342e) {
        int ordinal = enumC15342e.ordinal();
        if (ordinal == 0) {
            return "prev";
        }
        if (ordinal == 1 || ordinal == 2) {
            return "next";
        }
        if (ordinal == 3) {
            return "new";
        }
        throw new C14803e(10);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(4:21|(4:23|24|25|(1:27))|15|16)|11|12|(1:14)|15|16))|30|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r6 = new defpackage.C12763e(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object yandex(defpackage.C9438e r4, java.util.ArrayList r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C1204e
            if (r0 == 0) goto L13
            r0 = r6
            eؒٝٓ r0 = (defpackage.C1204e) r0
            int r1 = r0.f3835e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3835e = r1
            goto L18
        L13:
            eؒٝٓ r0 = new eؒٝٓ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3834e
            int r1 = r0.f3835e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L76
            goto L73
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L82
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.addAll(r5)
            eًًٖ r5 = new eًًٖ
            r5.<init>(r6)
            eًۛ۠ r6 = defpackage.AbstractC1831e.vip()     // Catch: java.lang.Throwable -> L76
            eِٙٙ r4 = r4.vip     // Catch: java.lang.Throwable -> L76
            r4.getClass()     // Catch: java.lang.Throwable -> L76
            eٌٗۛ r1 = defpackage.C7960e.Companion     // Catch: java.lang.Throwable -> L76
            eؘؒٙ r1 = r1.serializer()     // Catch: java.lang.Throwable -> L76
            eؘؒٙ r1 = (defpackage.InterfaceC5372e) r1     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = r4.purchase(r1, r5)     // Catch: java.lang.Throwable -> L76
            r0.f3835e = r2     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "stats.trackEvents"
            eؘُٛ r1 = new eؘُٛ     // Catch: java.lang.Throwable -> L76
            eٕؗۜ r3 = defpackage.C5170e.f11062e     // Catch: java.lang.Throwable -> L76
            r1.<init>(r5, r3)     // Catch: java.lang.Throwable -> L76
            r1.appmetrica = r2     // Catch: java.lang.Throwable -> L76
            java.lang.String r5 = "events"
            r1.ad(r5, r4)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r6 = r6.license(r1, r0)     // Catch: java.lang.Throwable -> L76
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r6 != r4) goto L73
            return r4
        L73:
            eٍؒۢ r6 = (defpackage.AbstractC9200e) r6     // Catch: java.lang.Throwable -> L76
            goto L7c
        L76:
            r4 = move-exception
            eّۜۖ r6 = new eّۜۖ
            r6.<init>(r4)
        L7c:
            boolean r4 = r6 instanceof defpackage.C12763e
            if (r4 != 0) goto L82
            eٍؒۢ r6 = (defpackage.AbstractC9200e) r6
        L82:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9438e.yandex(eٍّ۠, java.util.ArrayList, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0077e
    public final Object ad(C4532e c4532e, C3077e c3077e) {
        switch (this.ad) {
            case 0:
                if (!(c4532e.vip instanceof C16482e)) {
                    return Unit.INSTANCE;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.purchase.add(new C4030e(linkedHashMap));
                Object smaato = smaato(c3077e);
                return smaato == EnumC2821e.f6782e ? smaato : Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r2.appmetrica(r0) != r6) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:24:0x0054, B:26:0x0058, B:27:0x005e), top: B:23:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object amazon(defpackage.AbstractC10731e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C17726e
            if (r0 == 0) goto L13
            r0 = r9
            eْ٘ۙ r0 = (defpackage.C17726e) r0
            int r1 = r0.f34763e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34763e = r1
            goto L18
        L13:
            eْ٘ۙ r0 = new eْ٘ۙ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f34764e
            int r1 = r0.f34763e
            eٍٖ٘ r2 = r8.appmetrica
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L35
            eٍٖ٘ r2 = r0.f34765e
            eٌُؑ r1 = r0.f34760e
            java.lang.Object r0 = r0.f34762e
            eَٟۙ r0 = (defpackage.InterfaceC10500e) r0
            defpackage.AbstractC2003e.purchase(r9)
            goto L8d
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3d:
            java.lang.Object r1 = r0.f34762e
            eؚؗؔ r1 = (defpackage.InterfaceC4619e) r1
            defpackage.AbstractC2003e.purchase(r9)
            goto L54
        L45:
            defpackage.AbstractC2003e.purchase(r9)
            r0.f34762e = r2
            r0.f34763e = r4
            java.lang.Object r9 = r2.appmetrica(r0)
            if (r9 != r6) goto L53
            goto L8c
        L53:
            r1 = r2
        L54:
            eَٟۙ r9 = r8.license     // Catch: java.lang.Throwable -> L5c
            if (r9 == 0) goto L5e
            r9.Signature(r5)     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r9 = move-exception
            goto L9c
        L5e:
            r8.license = r5     // Catch: java.lang.Throwable -> L5c
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5c
            eٍٖ٘ r1 = (defpackage.C17651e) r1
            r1.billing(r5)
            eؚٖٟ r9 = new eؚٖٟ
            r1 = 20
            r9.<init>(r8, r5, r1)
            r1 = 3
            eٔٛۤ r4 = r8.metrica
            r7 = 0
            eٌُؑ r1 = defpackage.AbstractC5336e.purchase(r4, r5, r7, r9, r1)
            eٍؓۙ r9 = new eٍؓۙ
            r9.<init>(r7, r8)
            r1.mo692else(r9)
            r0.f34762e = r1
            r0.f34760e = r1
            r0.f34765e = r2
            r0.f34763e = r3
            java.lang.Object r9 = r2.appmetrica(r0)
            if (r9 != r6) goto L8d
        L8c:
            return r6
        L8d:
            r8.license = r1     // Catch: java.lang.Throwable -> L97
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L97
            r2.billing(r5)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L97:
            r9 = move-exception
            r2.billing(r5)
            throw r9
        L9c:
            eٍٖ٘ r1 = (defpackage.C17651e) r1
            r1.billing(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9438e.amazon(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0077e
    public final Object appmetrica(C4532e c4532e, C4532e c4532e2, EnumC4345e enumC4345e, InterfaceC5083e interfaceC5083e) {
        String str;
        switch (this.ad) {
            case 0:
                return Unit.INSTANCE;
            default:
                int ordinal = enumC4345e.ordinal();
                if (ordinal == 0) {
                    str = "seek";
                } else {
                    if (ordinal != 1) {
                        throw new C14803e(10);
                    }
                    str = "heartbeat";
                }
                this.purchase.add(mopub(c4532e2, c4532e, str));
                Object amazon = amazon((AbstractC10731e) interfaceC5083e);
                return amazon == EnumC2821e.f6782e ? amazon : Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC0077e
    public final Object license(C4532e c4532e, InterfaceC5083e interfaceC5083e) {
        switch (this.ad) {
            case 0:
                this.purchase.add(advert("music_stop_playback", c4532e, null, "pause"));
                Object smaato = smaato((AbstractC10731e) interfaceC5083e);
                return smaato == EnumC2821e.f6782e ? smaato : Unit.INSTANCE;
            default:
                this.purchase.add(mopub(c4532e, null, "pause"));
                Object amazon = amazon((AbstractC10731e) interfaceC5083e);
                return amazon == EnumC2821e.f6782e ? amazon : Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC0077e
    public final Object metrica(C4532e c4532e, C4532e c4532e2, EnumC15342e enumC15342e, InterfaceC5083e interfaceC5083e) {
        switch (this.ad) {
            case 0:
                boolean vip = vip(c4532e);
                ArrayList arrayList = this.purchase;
                if (vip) {
                    arrayList.add(advert("music_stop_playback", c4532e, null, startapp(enumC15342e)));
                }
                if (vip(c4532e2)) {
                    arrayList.add(advert("music_start_playback", c4532e2, c4532e, startapp(enumC15342e)));
                }
                Object smaato = smaato((AbstractC10731e) interfaceC5083e);
                return smaato == EnumC2821e.f6782e ? smaato : Unit.INSTANCE;
            default:
                boolean vip2 = vip(c4532e);
                ArrayList arrayList2 = this.purchase;
                if (vip2) {
                    arrayList2.add(mopub(c4532e, null, "heartbeat"));
                }
                if (vip(c4532e2)) {
                    arrayList2.add(mopub(c4532e, c4532e, "play"));
                }
                Object amazon = amazon((AbstractC10731e) interfaceC5083e);
                return amazon == EnumC2821e.f6782e ? amazon : Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC0077e
    public final Object purchase(C4532e c4532e, C8536e c8536e) {
        switch (this.ad) {
            case 0:
                this.purchase.add(advert("music_start_playback", c4532e, null, "continue"));
                Object smaato = smaato(c8536e);
                return smaato == EnumC2821e.f6782e ? smaato : Unit.INSTANCE;
            default:
                this.purchase.add(mopub(c4532e, null, "play"));
                Object amazon = amazon(c8536e);
                return amazon == EnumC2821e.f6782e ? amazon : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r2.appmetrica(r0) != r6) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:24:0x0054, B:26:0x0058, B:27:0x005e), top: B:23:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object smaato(defpackage.AbstractC10731e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C14159e
            if (r0 == 0) goto L13
            r0 = r9
            eٟٓۡ r0 = (defpackage.C14159e) r0
            int r1 = r0.f28000e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28000e = r1
            goto L18
        L13:
            eٟٓۡ r0 = new eٟٓۡ
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f28001e
            int r1 = r0.f28000e
            eٍٖ٘ r2 = r8.appmetrica
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L45
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L35
            eٍٖ٘ r2 = r0.f28002e
            eٌُؑ r1 = r0.f27997e
            java.lang.Object r0 = r0.f27999e
            eَٟۙ r0 = (defpackage.InterfaceC10500e) r0
            defpackage.AbstractC2003e.purchase(r9)
            goto L8f
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3d:
            java.lang.Object r1 = r0.f27999e
            eؚؗؔ r1 = (defpackage.InterfaceC4619e) r1
            defpackage.AbstractC2003e.purchase(r9)
            goto L54
        L45:
            defpackage.AbstractC2003e.purchase(r9)
            r0.f27999e = r2
            r0.f28000e = r4
            java.lang.Object r9 = r2.appmetrica(r0)
            if (r9 != r6) goto L53
            goto L8e
        L53:
            r1 = r2
        L54:
            eَٟۙ r9 = r8.license     // Catch: java.lang.Throwable -> L5c
            if (r9 == 0) goto L5e
            r9.Signature(r5)     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r9 = move-exception
            goto L9e
        L5e:
            r8.license = r5     // Catch: java.lang.Throwable -> L5c
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5c
            eٍٖ٘ r1 = (defpackage.C17651e) r1
            r1.billing(r5)
            eؚٖٟ r9 = new eؚٖٟ
            r1 = 13
            r9.<init>(r8, r5, r1)
            r1 = 3
            r4 = 0
            eٔٛۤ r7 = r8.metrica
            eٌُؑ r1 = defpackage.AbstractC5336e.purchase(r7, r5, r4, r9, r1)
            e٘ۗۦ r9 = new e٘ۗۦ
            r4 = 29
            r9.<init>(r4, r8)
            r1.mo692else(r9)
            r0.f27999e = r1
            r0.f27997e = r1
            r0.f28002e = r2
            r0.f28000e = r3
            java.lang.Object r9 = r2.appmetrica(r0)
            if (r9 != r6) goto L8f
        L8e:
            return r6
        L8f:
            r8.license = r1     // Catch: java.lang.Throwable -> L99
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L99
            r2.billing(r5)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L99:
            r9 = move-exception
            r2.billing(r5)
            throw r9
        L9e:
            eٍٖ٘ r1 = (defpackage.C17651e) r1
            r1.billing(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9438e.smaato(eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0077e
    public final boolean vip(C4532e c4532e) {
        switch (this.ad) {
            case 0:
                if (c4532e.vip instanceof InterfaceC16793e) {
                    C14609e c14609e = c4532e.ad;
                    if ((c14609e != null ? c14609e.vip : null) instanceof AudioTrack) {
                        AudioTrack audioTrack = (AudioTrack) (c14609e != null ? c14609e.vip : null);
                        audioTrack.getClass();
                        if (!AbstractC1786e.appmetrica(audioTrack)) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                if (c4532e.vip instanceof C4464e) {
                    C14609e c14609e2 = c4532e.ad;
                    if ((c14609e2 != null ? c14609e2.vip : null) instanceof AudioTrack) {
                        AudioTrack audioTrack2 = (AudioTrack) (c14609e2 != null ? c14609e2.vip : null);
                        audioTrack2.getClass();
                        if (AbstractC1786e.appmetrica(audioTrack2)) {
                            return true;
                        }
                    }
                }
                return false;
        }
    }
}
