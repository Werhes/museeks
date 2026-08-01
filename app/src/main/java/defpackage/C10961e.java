package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10961e extends AbstractC1487e implements InterfaceC7268e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C2271e f21705e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C3432e f21706e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C5566e f21707e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C2271e f21708e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C2271e f21709e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C2271e f21710e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C2271e f21711e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C2271e f21712e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C2271e f21713e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C2271e f21714e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C2271e f21715e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C2271e f21716e;

    /* JADX WARN: Type inference failed for: r2v1, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v10, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v3, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v6, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v7, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v8, types: [eٕ٘ؔ, eؓۨۖ] */
    /* JADX WARN: Type inference failed for: r2v9, types: [eٕ٘ؔ, eؓۨۖ] */
    public C10961e(C15398e c15398e) {
        super(c15398e);
        this.f21705e = new C17519e(0);
        this.f21716e = new C17519e(0);
        this.f21715e = new C17519e(0);
        this.f21712e = new C17519e(0);
        this.f21714e = new C17519e(0);
        this.f21708e = new C17519e(0);
        this.f21709e = new C17519e(0);
        this.f21710e = new C17519e(0);
        this.f21711e = new C17519e(0);
        this.f21713e = new C17519e(0);
        this.f21707e = new C5566e(this);
        this.f21706e = new C3432e(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕ٘ؔ, eؓۨۖ] */
    /* renamed from: eُِۤ, reason: contains not printable characters */
    public static final C2271e m2948e(C10110e c10110e) {
        ?? c17519e = new C17519e(0);
        for (C17330e c17330e : c10110e.isPro()) {
            c17519e.put(c17330e.signatures(), c17330e.tapsense());
        }
        return c17519e;
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public static final EnumC9102e m2949e(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return EnumC9102e.AD_STORAGE;
        }
        if (i2 == 2) {
            return EnumC9102e.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return EnumC9102e.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return EnumC9102e.AD_PERSONALIZATION;
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final boolean m2950e(String str) {
        mo2250e();
        m2951e(str);
        C12607e m2952e = m2952e(str);
        if (m2952e == null) {
            return false;
        }
        for (C10291e c10291e : m2952e.signatures()) {
            if (c10291e.signatures() == 3 && c10291e.isVip() == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC7268e
    /* renamed from: eٟؕۡ */
    public final String mo2279e(String str, String str2) {
        mo2250e();
        m2951e(str);
        Map map = (Map) this.f21705e.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final void m2951e(String str) {
        m613e();
        mo2250e();
        AbstractC9528e.purchase(str);
        C2271e c2271e = this.f21708e;
        if (c2271e.get(str) == null) {
            C1248e c1248e = this.f19060e.f30353e;
            C15398e.m3939break(c1248e);
            C0912e m531e = c1248e.m531e(str);
            C2271e c2271e2 = this.f21711e;
            C2271e c2271e3 = this.f21710e;
            C2271e c2271e4 = this.f21709e;
            C2271e c2271e5 = this.f21705e;
            if (m531e != null) {
                C0344e c0344e = (C0344e) m2963e(str, (byte[]) m531e.f3332e).advert();
                m2956e(str, c0344e);
                c2271e5.put(str, m2948e((C10110e) c0344e.appmetrica()));
                c2271e.put(str, (C10110e) c0344e.appmetrica());
                m2954e(str, (C10110e) c0344e.appmetrica());
                c2271e4.put(str, ((C10110e) c0344e.f12709e).m2764class());
                c2271e3.put(str, (String) m531e.f3331e);
                c2271e2.put(str, (String) m531e.f3333e);
                return;
            }
            c2271e5.put(str, null);
            this.f21715e.put(str, null);
            this.f21716e.put(str, null);
            this.f21712e.put(str, null);
            this.f21714e.put(str, null);
            c2271e.put(str, null);
            c2271e4.put(str, null);
            c2271e3.put(str, null);
            c2271e2.put(str, null);
            this.f21713e.put(str, null);
        }
    }

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public final C12607e m2952e(String str) {
        mo2250e();
        m2951e(str);
        C10110e m2965e = m2965e(str);
        if (m2965e == null || !m2965e.m2767interface()) {
            return null;
        }
        return m2965e.m2766goto();
    }

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final boolean m2953e(String str, String str2) {
        Boolean bool;
        mo2250e();
        m2951e(str);
        if ("1".equals(mo2279e(str, "measurement.upload.blacklist_internal")) && C5240e.m1785e(str2)) {
            return true;
        }
        if ("1".equals(mo2279e(str, "measurement.upload.blacklist_public")) && C5240e.m1780e(str2)) {
            return true;
        }
        Map map = (Map) this.f21715e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final void m2954e(String str, C10110e c10110e) {
        C6936e c6936e = (C6936e) this.f36443e;
        int crashlytics = c10110e.crashlytics();
        C5566e c5566e = this.f21707e;
        if (crashlytics == 0) {
            c5566e.license(str);
            return;
        }
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27497e.vip(Integer.valueOf(c10110e.crashlytics()), "EES programs found");
        C17226e c17226e = (C17226e) c10110e.subs().get(0);
        try {
            C9963e c9963e = new C9963e();
            C11980e c11980e = c9963e.ad;
            ((HashMap) ((C7850e) c11980e.f23948e).f15896e).put("internal.remoteConfig", new CallableC13061e(this, str, 2));
            ((HashMap) ((C7850e) c11980e.f23948e).f15896e).put("internal.appMetadata", new CallableC13061e(this, str, 0));
            ((HashMap) ((C7850e) c11980e.f23948e).f15896e).put("internal.logger", new CallableC8878e(3, this));
            c9963e.vip(c17226e);
            c5566e.metrica(str, c9963e);
            C6936e.yandex(c13879e);
            C14937e c14937e = c13879e.f27497e;
            c14937e.metrica(str, Integer.valueOf(c17226e.tapsense().tapsense()), "EES program loaded for appId, activities");
            for (C18154e c18154e : c17226e.tapsense().signatures()) {
                C6936e.yandex(c13879e);
                c14937e.vip(c18154e.signatures(), "EES program activity");
            }
        } catch (C8403e unused) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27502e.vip(str, "Failed to load EES program. appId");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0462, code lost:
    
        r9.m613e();
        r9.mo2250e();
        defpackage.AbstractC9528e.purchase(r29);
        r0 = r9.m533e();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r29, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0485, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0346, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x032a, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02ce, code lost:
    
        r0 = r14.f14227e;
        defpackage.C6936e.yandex(r0);
        r0 = r0.f27495e;
        r4 = defpackage.C13879e.m3689e(r29);
        r6 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e3, code lost:
    
        if (r7.signatures() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e5, code lost:
    
        r21 = java.lang.Integer.valueOf(r7.tapsense());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f7, code lost:
    
        r0.license("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r4, r6, java.lang.String.valueOf(r21));
        r25 = r3;
        r26 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f5, code lost:
    
        r21 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x038a, code lost:
    
        r25 = r3;
        r26 = r5;
        r3 = r23.isVip().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x039a, code lost:
    
        if (r3.hasNext() == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x039c, code lost:
    
        r5 = (defpackage.C4512e) r3.next();
        r9.m613e();
        r9.mo2250e();
        defpackage.AbstractC9528e.purchase(r29);
        defpackage.AbstractC9528e.startapp(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03b6, code lost:
    
        if (r5.isVip().isEmpty() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03e2, code lost:
    
        r6 = r5.ad();
        r7 = new android.content.ContentValues();
        r7.put(r1, r29);
        r23 = r1;
        r7.put(r0, java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03fb, code lost:
    
        if (r5.signatures() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03fd, code lost:
    
        r1 = java.lang.Integer.valueOf(r5.tapsense());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0407, code lost:
    
        r7.put("filter_id", r1);
        r27 = r0;
        r7.put("property_name", r5.isVip());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0419, code lost:
    
        if (r5.ads() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x041b, code lost:
    
        r0 = java.lang.Boolean.valueOf(r5.premium());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0425, code lost:
    
        r7.put("session_scoped", r0);
        r7.put("data", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0437, code lost:
    
        if (r9.m533e().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x044c, code lost:
    
        r1 = r23;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0439, code lost:
    
        r0 = r14.f14227e;
        defpackage.C6936e.yandex(r0);
        r0.f27502e.vip(defpackage.C13879e.m3689e(r29), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x044a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0452, code lost:
    
        r1 = r14.f14227e;
        defpackage.C6936e.yandex(r1);
        r1.f27502e.metrica(defpackage.C13879e.m3689e(r29), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0424, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0406, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b8, code lost:
    
        r0 = r14.f14227e;
        defpackage.C6936e.yandex(r0);
        r0 = r0.f27495e;
        r3 = defpackage.C13879e.m3689e(r29);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03cd, code lost:
    
        if (r5.signatures() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03cf, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.tapsense());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d9, code lost:
    
        r0.license("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03d8, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0264, code lost:
    
        r6 = r0.isVip().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0270, code lost:
    
        if (r6.hasNext() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027c, code lost:
    
        if (((defpackage.C4512e) r6.next()).signatures() != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027e, code lost:
    
        r0 = r14.f14227e;
        defpackage.C6936e.yandex(r0);
        r0.f27495e.metrica(defpackage.C13879e.m3689e(r29), java.lang.Integer.valueOf(r5), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0294, code lost:
    
        r6 = r0.applovin().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a0, code lost:
    
        r23 = r0;
        r0 = "audience_id";
        r24 = r1;
        r1 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b0, code lost:
    
        if (r6.hasNext() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b2, code lost:
    
        r7 = (defpackage.C12919e) r6.next();
        r9.m613e();
        r9.mo2250e();
        defpackage.AbstractC9528e.purchase(r29);
        defpackage.AbstractC9528e.startapp(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02cc, code lost:
    
        if (r7.isVip().isEmpty() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0304, code lost:
    
        r25 = r3;
        r3 = r7.ad();
        r26 = r5;
        r5 = new android.content.ContentValues();
        r5.put("app_id", r29);
        r5.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031f, code lost:
    
        if (r7.signatures() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0321, code lost:
    
        r0 = java.lang.Integer.valueOf(r7.tapsense());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x032b, code lost:
    
        r5.put("filter_id", r0);
        r5.put("event_name", r7.isVip());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x033b, code lost:
    
        if (r7.firebase() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x033d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r7.m3421class());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0347, code lost:
    
        r5.put("session_scoped", r0);
        r5.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0359, code lost:
    
        if (r9.m533e().insertWithOnConflict("event_filters", null, r5, 5) != (-1)) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x035b, code lost:
    
        r0 = r14.f14227e;
        defpackage.C6936e.yandex(r0);
        r0.f27502e.vip(defpackage.C13879e.m3689e(r29), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x036e, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x036c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0378, code lost:
    
        r1 = r14.f14227e;
        defpackage.C6936e.yandex(r1);
        r1.f27502e.metrica(defpackage.C13879e.m3689e(r29), r0, "Error storing event filter. appId");
     */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05f1 A[Catch: SQLiteException -> 0x0602, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0602, blocks: (B:182:0x05da, B:184:0x05f1), top: B:181:0x05da }] */
    /* renamed from: eًؕ۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2955e(java.lang.String r29, java.lang.String r30, java.lang.String r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 1581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10961e.m2955e(java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final void m2956e(String str, C0344e c0344e) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        C17519e c17519e = new C17519e(0);
        C17519e c17519e2 = new C17519e(0);
        C17519e c17519e3 = new C17519e(0);
        Iterator it = DesugarCollections.unmodifiableList(((C10110e) c0344e.f12709e).firebase()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C9511e) it.next()).signatures());
        }
        C6936e c6936e = (C6936e) this.f36443e;
        C10476e c10476e = c6936e.f14221e;
        C13879e c13879e = c6936e.f14227e;
        C6973e c6973e = AbstractC17254e.f33805e;
        if (c10476e.m2822e(null, c6973e)) {
            arrayList2.addAll(DesugarCollections.unmodifiableList(((C10110e) c0344e.f12709e).m2765extends()));
        }
        while (i < ((C10110e) c0344e.f12709e).applovin()) {
            C15040e c15040e = (C15040e) ((C10110e) c0344e.f12709e).ads(i).advert();
            if (c15040e.yandex().isEmpty()) {
                C6936e.yandex(c13879e);
                c13879e.f27495e.ad("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String yandex = c15040e.yandex();
                arrayList = arrayList2;
                String smaato = AbstractC15367e.smaato(c15040e.yandex(), AbstractC12992e.metrica, AbstractC12992e.yandex);
                if (!TextUtils.isEmpty(smaato)) {
                    c15040e.vip();
                    ((C8720e) c15040e.f12709e).premium(smaato);
                    c0344e.vip();
                    ((C10110e) c0344e.f12709e).m2771try(i, (C8720e) c15040e.appmetrica());
                }
                if (((C8720e) c15040e.f12709e).tapsense() && ((C8720e) c15040e.f12709e).isVip()) {
                    c17519e.put(yandex, Boolean.TRUE);
                }
                if (((C8720e) c15040e.f12709e).inmobi() && ((C8720e) c15040e.f12709e).isPro()) {
                    c17519e2.put(c15040e.yandex(), Boolean.TRUE);
                }
                if (((C8720e) c15040e.f12709e).applovin()) {
                    if (((C8720e) c15040e.f12709e).ads() < 2 || ((C8720e) c15040e.f12709e).ads() > 65535) {
                        C6936e.yandex(c13879e);
                        c13879e.f27495e.metrica(c15040e.yandex(), Integer.valueOf(((C8720e) c15040e.f12709e).ads()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c17519e3.put(c15040e.yandex(), Integer.valueOf(((C8720e) c15040e.f12709e).ads()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f21716e.put(str, hashSet);
        if (c6936e.f14221e.m2822e(null, c6973e)) {
            this.f21714e.put(str, arrayList3);
        }
        this.f21715e.put(str, c17519e);
        this.f21712e.put(str, c17519e2);
        this.f21713e.put(str, c17519e3);
    }

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public final boolean m2957e(String str, EnumC9102e enumC9102e) {
        mo2250e();
        m2951e(str);
        C12607e m2952e = m2952e(str);
        if (m2952e == null) {
            return false;
        }
        for (C10291e c10291e : m2952e.signatures()) {
            if (enumC9102e == m2949e(c10291e.signatures())) {
                return c10291e.tapsense() == 2;
            }
        }
        return false;
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final String m2958e(String str) {
        mo2250e();
        m2951e(str);
        return (String) this.f21709e.get(str);
    }

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public final boolean m2959e(String str) {
        mo2250e();
        m2951e(str);
        C2271e c2271e = this.f21716e;
        return c2271e.get(str) != null && ((Set) c2271e.get(str)).contains("app_instance_id");
    }

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public final boolean m2960e(String str) {
        mo2250e();
        m2951e(str);
        C2271e c2271e = this.f21716e;
        if (c2271e.get(str) != null) {
            return ((Set) c2271e.get(str)).contains("os_version") || ((Set) c2271e.get(str)).contains("device_info");
        }
        return false;
    }

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public final int m2961e(String str, String str2) {
        Integer num;
        mo2250e();
        m2951e(str);
        Map map = (Map) this.f21713e.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public final boolean m2962e(String str, String str2) {
        Boolean bool;
        mo2250e();
        m2951e(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f21712e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final C10110e m2963e(String str, byte[] bArr) {
        C6936e c6936e = (C6936e) this.f36443e;
        if (bArr == null) {
            return C10110e.m2762while();
        }
        try {
            C10110e c10110e = (C10110e) ((C0344e) C10686e.m2868e(C10110e.m2761throw(), bArr)).appmetrica();
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.metrica(c10110e.signatures() ? Long.valueOf(c10110e.tapsense()) : null, c10110e.isVip() ? c10110e.inmobi() : null, "Parsed config. version, gmp_app_id");
            return c10110e;
        } catch (C10895e e) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27495e.metrica(C13879e.m3689e(str), e, "Unable to merge remote config. appId");
            return C10110e.m2762while();
        } catch (RuntimeException e2) {
            C13879e c13879e3 = c6936e.f14227e;
            C6936e.yandex(c13879e3);
            c13879e3.f27495e.metrica(C13879e.m3689e(str), e2, "Unable to merge remote config. appId");
            return C10110e.m2762while();
        }
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final EnumC18450e m2964e(String str, EnumC9102e enumC9102e) {
        mo2250e();
        m2951e(str);
        C12607e m2952e = m2952e(str);
        if (m2952e != null) {
            Iterator it = m2952e.applovin().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C10291e c10291e = (C10291e) it.next();
                if (m2949e(c10291e.signatures()) == enumC9102e) {
                    int tapsense = c10291e.tapsense() - 1;
                    if (tapsense == 1) {
                        return EnumC18450e.GRANTED;
                    }
                    if (tapsense == 2) {
                        return EnumC18450e.DENIED;
                    }
                }
            }
        }
        return EnumC18450e.UNINITIALIZED;
    }

    @Override // defpackage.AbstractC1487e
    /* renamed from: eّٖٗ */
    public final void mo554e() {
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final C10110e m2965e(String str) {
        m613e();
        mo2250e();
        AbstractC9528e.purchase(str);
        m2951e(str);
        return (C10110e) this.f21708e.get(str);
    }

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public final List m2966e(String str) {
        mo2250e();
        m2951e(str);
        return (List) this.f21714e.get(str);
    }
}
