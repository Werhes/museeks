package defpackage;

import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13025e implements InterfaceC0077e {
    public final C11817e ad = AbstractC7763e.ad(new C13887e(13));

    public static C4030e billing(C4532e c4532e, C4532e c4532e2, String str) {
        C6571e c6571e;
        C13935e c13935e = new C13935e(15);
        UmaTrack umaTrack = (UmaTrack) c4532e.ad;
        InterfaceC11140e interfaceC11140e = (InterfaceC11140e) c4532e.vip;
        if (interfaceC11140e instanceof C8040e) {
            c6571e = new C6571e(((C8040e) interfaceC11140e).ad.metrica(), "mix");
        } else {
            if (!(interfaceC11140e instanceof C8211e)) {
                throw new C14803e(10);
            }
            c6571e = new C6571e("/share/file/" + umaTrack.ad, "main");
        }
        AbstractC10681e.appmetrica(c13935e, "activity_type", 1);
        AbstractC10681e.appmetrica(c13935e, "add_action", 0);
        AbstractC10681e.purchase(c13935e, "app_state_start", "active");
        AbstractC10681e.purchase(c13935e, "app_state_end", "active");
        AbstractC10681e.appmetrica(c13935e, "use_type", 0);
        AbstractC10681e.appmetrica(c13935e, "volume", 20);
        AbstractC10681e.purchase(c13935e, "repeat", "off");
        AbstractC10681e.purchase(c13935e, "shuffle", "off");
        AbstractC10681e.appmetrica(c13935e, "progress", Long.valueOf(c4532e.license));
        AbstractC10681e.purchase(c13935e, "end_stream_reason", str);
        AbstractC10681e.purchase(c13935e, "source_uri", (String) c6571e.f13544e);
        AbstractC10681e.purchase(c13935e, "source_client", (String) c6571e.f13543e);
        AbstractC10681e.purchase(c13935e, "file_id", umaTrack.ad);
        AbstractC10681e.appmetrica(c13935e, "client_time", Long.valueOf(c4532e2 != null ? c4532e2.metrica : c4532e.metrica));
        if (str.equals("unknown")) {
            AbstractC10681e.appmetrica(c13935e, "client_stop_time", 0L);
        } else {
            AbstractC10681e.appmetrica(c13935e, "client_stop_time", Long.valueOf(System.currentTimeMillis() / 1000));
        }
        if (c4532e2 != null) {
            C14609e c14609e = c4532e2.ad;
        }
        return new C4030e((LinkedHashMap) c13935e.f27641e);
    }

    @Override // defpackage.InterfaceC0077e
    public final Object ad(C4532e c4532e, C3077e c3077e) {
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC0077e
    public final Object appmetrica(C4532e c4532e, C4532e c4532e2, EnumC4345e enumC4345e, InterfaceC5083e interfaceC5083e) {
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC0077e
    public final Object license(C4532e c4532e, InterfaceC5083e interfaceC5083e) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
    
        if (r9.metrica(r0) == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r11.metrica(r0) == r6) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.InterfaceC0077e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.C4532e r8, defpackage.C4532e r9, defpackage.EnumC15342e r10, defpackage.InterfaceC5083e r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.C2352e
            if (r0 == 0) goto L13
            r0 = r11
            eٜؔؔ r0 = (defpackage.C2352e) r0
            int r1 = r0.f5889e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5889e = r1
            goto L1a
        L13:
            eٜؔؔ r0 = new eٜؔؔ
            eُؑ۠ r11 = (defpackage.AbstractC10731e) r11
            r0.<init>(r7, r11)
        L1a:
            java.lang.Object r11 = r0.f5892e
            int r1 = r0.f5889e
            eِٙٙ r2 = r7.ad
            r3 = 2
            r4 = 1
            r5 = 0
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L40
            if (r1 == r4) goto L38
            if (r1 != r3) goto L30
            defpackage.AbstractC2003e.purchase(r11)
            goto Lca
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            eؖۧۥ r9 = r0.f5888e
            eؖۧۥ r8 = r0.f5890e
            defpackage.AbstractC2003e.purchase(r11)
            goto L9c
        L40:
            defpackage.AbstractC2003e.purchase(r11)
            boolean r11 = r7.vip(r8)
            if (r11 == 0) goto L9c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r10 = r10.ordinal()
            if (r10 == 0) goto L6c
            if (r10 == r4) goto L69
            if (r10 == r3) goto L66
            r1 = 3
            if (r10 != r1) goto L5e
            java.lang.String r10 = "playlist_change"
            goto L6e
        L5e:
            eٔٚؖ r8 = new eٔٚؖ
            r9 = 10
            r8.<init>(r9)
            throw r8
        L66:
            java.lang.String r10 = "completed"
            goto L6e
        L69:
            java.lang.String r10 = "next_btn"
            goto L6e
        L6c:
            java.lang.String r10 = "previous_btn"
        L6e:
            eُؖؔ r10 = billing(r8, r5, r10)
            r11.add(r10)
            eًًٖ r10 = new eًًٖ
            r10.<init>(r11)
            r2.getClass()
            eٌٗۛ r11 = defpackage.C7960e.Companion
            eؘؒٙ r11 = r11.serializer()
            eؘؒٙ r11 = (defpackage.InterfaceC5372e) r11
            java.lang.String r10 = r2.purchase(r11, r10)
            eَٖۤ r11 = new eَٖۤ
            r1 = 3
            r11.<init>(r10, r1)
            r0.f5890e = r8
            r0.f5888e = r9
            r0.f5889e = r4
            java.lang.Object r10 = r11.metrica(r0)
            if (r10 != r6) goto L9c
            goto Lc9
        L9c:
            boolean r10 = r7.vip(r9)
            if (r10 == 0) goto Lcd
            java.lang.String r10 = "unknown"
            eُؖؔ r8 = billing(r9, r8, r10)
            r2.getClass()
            eٍۗٓ r9 = defpackage.C4030e.Companion
            eؘؒٙ r9 = r9.serializer()
            eؘؒٙ r9 = (defpackage.InterfaceC5372e) r9
            java.lang.String r8 = r2.purchase(r9, r8)
            eَٖۤ r9 = new eَٖۤ
            r10 = 2
            r9.<init>(r8, r10)
            r0.f5890e = r5
            r0.f5888e = r5
            r0.f5889e = r3
            java.lang.Object r8 = r9.metrica(r0)
            if (r8 != r6) goto Lca
        Lc9:
            return r6
        Lca:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        Lcd:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13025e.metrica(eؖۧۥ, eؖۧۥ, eٌٕٔ, eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0077e
    public final Object purchase(C4532e c4532e, C8536e c8536e) {
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC0077e
    public final boolean vip(C4532e c4532e) {
        if (!(c4532e.vip instanceof InterfaceC11140e)) {
            return false;
        }
        C14609e c14609e = c4532e.ad;
        return false;
    }
}
