package defpackage;

import android.os.Build;
import android.view.DragEvent;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0882e {
    public static final C2892e ad = new C2892e(269933948, false, new C14123e(0));
    public static final C2892e vip = new C2892e(1838086042, false, new C14123e(1));
    public static final C2892e metrica = new C2892e(-1757805955, false, new C14123e(2));
    public static final C2892e license = new C2892e(1333039280, false, new C14123e(3));
    public static final C2892e appmetrica = new C2892e(1340348112, false, new C14123e(4));
    public static final C2892e purchase = new C2892e(-680938072, false, new C14123e(5));
    public static final C2892e billing = new C2892e(-1458677355, false, new C14123e(6));
    public static final C2892e yandex = new C2892e(144382775, false, new C14234e(27));
    public static final C2892e startapp = new C2892e(1512304187, false, new C14234e(28));
    public static final C2892e adcel = new C2892e(-459709479, false, new C14123e(7));

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0138, code lost:
    
        if (r11 == r9) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ad(defpackage.C2628e r21, defpackage.InterfaceC12864e r22, boolean r23, boolean r24, boolean r25, kotlin.jvm.functions.Function1 r26, defpackage.C2892e r27, defpackage.C13770e r28, final int r29) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0882e.ad(eؔٗٓ, eّۤۧ, boolean, boolean, boolean, kotlin.jvm.functions.Function1, eؔ۟ٓ, eٓؕۥ, int):void");
    }

    public static String appmetrica(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int[] billing(String str) {
        List list;
        Collection collection;
        try {
            Pattern compile = Pattern.compile("\\.");
            AbstractC5304e.m1867new(0);
            Matcher matcher = compile.matcher(str);
            if (matcher.find()) {
                ArrayList arrayList = new ArrayList(10);
                int i = 0;
                do {
                    arrayList.add(str.subSequence(i, matcher.start()).toString());
                    i = matcher.end();
                } while (matcher.find());
                arrayList.add(str.subSequence(i, str.length()).toString());
                list = arrayList;
            } else {
                list = Collections.singletonList(str.toString());
            }
            if (!list.isEmpty()) {
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = AbstractC13480e.m3602switch(list, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = C13664e.f27089e;
            String[] strArr = (String[]) collection.toArray(new String[0]);
            int[] iArr = new int[strArr.length];
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = Integer.parseInt(strArr[i2]);
            }
            return iArr;
        } catch (Exception unused) {
            return new int[]{-1};
        }
    }

    public static final long license(C6057e c6057e) {
        DragEvent dragEvent = c6057e.ad;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static String metrica(subs subsVar) {
        StringBuilder sb;
        Cdefault billing2;
        if (subsVar instanceof Cdefault) {
            billing2 = (Cdefault) subsVar;
        } else {
            if (!AbstractC0869e.premium(subsVar)) {
                sb = new StringBuilder("unknown object type ");
                sb.append(subsVar.toString());
                return sb.toString();
            }
            billing2 = subsVar.billing();
        }
        sb = new StringBuilder();
        vip(BuildConfig.FLAVOR, billing2, sb);
        return sb.toString();
    }

    public static boolean purchase() {
        boolean z;
        int i;
        int i2;
        String str = Build.VERSION.INCREMENTAL;
        if (AbstractC7890e.billing(str, "20.2.20")) {
            return true;
        }
        int[] billing2 = billing(str);
        int[] billing3 = billing("20.2.20");
        int length = billing3.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (i3 >= billing2.length || (i = billing2[i3]) < (i2 = billing3[i3])) {
                if ("0".equals(appmetrica("persist.sys.miui_optimization"))) {
                    z = true;
                } else {
                    try {
                        z = ((Boolean) Class.forName("android.miui.AppOpsUtils").getDeclaredMethod("isXOptMode", null).invoke(null, null)).booleanValue();
                    } catch (Exception unused) {
                        z = false;
                    }
                }
                return z;
            }
            if (i > i2) {
                return true;
            }
        }
        return true;
    }

    public static void vip(String str, Cdefault cdefault, StringBuilder sb) {
        String str2 = AbstractC1433e.ad;
        sb.append(str);
        if (cdefault instanceof Cnative) {
            sb.append("NULL");
            sb.append(str2);
            return;
        }
        int i = 0;
        if (cdefault instanceof Ccatch) {
            sb.append(cdefault instanceof C5308e ? "BER Sequence" : cdefault instanceof C10154e ? "DER Sequence" : "Sequence");
            sb.append(str2);
            Ccatch ccatch = (Ccatch) cdefault;
            String adcel2 = AbstractC10257e.adcel(str, "    ");
            int size = ccatch.size();
            while (i < size) {
                vip(adcel2, ccatch.mo171interface(i).billing(), sb);
                i++;
            }
            return;
        }
        if (cdefault instanceof Cfinal) {
            sb.append(cdefault instanceof C2956e ? "BER Set" : cdefault instanceof C13346e ? "DER Set" : "Set");
            sb.append(str2);
            subs[] subsVarArr = ((Cfinal) cdefault).f36388e;
            String adcel3 = AbstractC10257e.adcel(str, "    ");
            int length = subsVarArr.length;
            while (i < length) {
                vip(adcel3, subsVarArr[i].billing(), sb);
                i++;
            }
            return;
        }
        if (cdefault instanceof Cstrictfp) {
            sb.append(cdefault instanceof C8367e ? "BER Tagged " : cdefault instanceof C15289e ? "DER Tagged " : "Tagged ");
            Cstrictfp cstrictfp = (Cstrictfp) cdefault;
            sb.append(AbstractC9947e.vip(cstrictfp.f36463e, cstrictfp.f36462e));
            if (!cstrictfp.m4635interface()) {
                sb.append(" IMPLICIT");
            }
            sb.append(str2);
            String str3 = str + "    ";
            subs subsVar = cstrictfp.f36464e;
            vip(str3, (subsVar instanceof Cextends ? (Cextends) subsVar : subsVar.billing()).billing(), sb);
            return;
        }
        if (cdefault instanceof Ctry) {
            sb.append("ObjectIdentifier(" + ((Ctry) cdefault).m4673class() + ")" + str2);
            return;
        }
        if (cdefault instanceof Cimplements) {
            sb.append("RelativeOID(" + ((Cimplements) cdefault).crashlytics() + ")" + str2);
            return;
        }
        if (cdefault instanceof ads) {
            sb.append("Boolean(" + ((ads) cdefault).firebase() + ")" + str2);
            return;
        }
        if (cdefault instanceof Cthis) {
            sb.append("Integer(" + ((Cthis) cdefault).firebase() + ")" + str2);
            return;
        }
        if (cdefault instanceof Cprotected) {
            byte[] bArr = ((Cprotected) cdefault).f36449e;
            sb.append(cdefault instanceof C6210e ? "BER Constructed Octet String[" : "DER Octet String[");
            sb.append(bArr.length + "]" + str2);
            return;
        }
        if (cdefault instanceof isPro) {
            isPro ispro = (isPro) cdefault;
            sb.append(ispro instanceof C14458e ? "DER Bit String[" : ispro instanceof C6769e ? "DL Bit String[" : "BER Bit String[");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ispro.f36413e.length - 1);
            sb2.append(", ");
            sb2.append(ispro.adcel());
            sb2.append("]");
            sb2.append(str2);
            sb.append(sb2.toString());
            return;
        }
        if (cdefault instanceof C10911e) {
            sb.append("IA5String(" + AbstractC1433e.ad(((C10911e) cdefault).f21614e) + ") " + str2);
            return;
        }
        if (cdefault instanceof C6310e) {
            sb.append("UTF8String(" + ((C6310e) cdefault).yandex() + ") " + str2);
            return;
        }
        if (cdefault instanceof C6699e) {
            sb.append("NumericString(" + AbstractC1433e.ad(((C6699e) cdefault).f13843e) + ") " + str2);
            return;
        }
        if (cdefault instanceof C9169e) {
            sb.append("PrintableString(" + AbstractC1433e.ad(((C9169e) cdefault).f18346e) + ") " + str2);
            return;
        }
        if (cdefault instanceof C10409e) {
            sb.append("VisibleString(" + AbstractC1433e.ad(((C10409e) cdefault).f20579e) + ") " + str2);
            return;
        }
        if (cdefault instanceof C3102e) {
            sb.append("BMPString(" + ((C3102e) cdefault).yandex() + ") " + str2);
            return;
        }
        if (cdefault instanceof C12873e) {
            sb.append("T61String(" + AbstractC1433e.ad(((C12873e) cdefault).f25720e) + ") " + str2);
            return;
        }
        if (cdefault instanceof C0674e) {
            sb.append("GraphicString(" + AbstractC1433e.ad(((C0674e) cdefault).f2940e) + ") " + str2);
            return;
        }
        if (cdefault instanceof C17568e) {
            sb.append("VideotexString(" + AbstractC1433e.ad(((C17568e) cdefault).f34415e) + ") " + str2);
            return;
        }
        if (cdefault instanceof Cprivate) {
            sb.append("UTCTime(" + ((Cprivate) cdefault).subs() + ") " + str2);
            return;
        }
        if (cdefault instanceof Cinterface) {
            sb.append("GeneralizedTime(" + ((Cinterface) cdefault).m4599interface() + ") " + str2);
            return;
        }
        if (cdefault instanceof firebase) {
            sb.append("DER Enumerated(" + new BigInteger(((firebase) cdefault).f36394e) + ")" + str2);
            return;
        }
        if (cdefault instanceof Cthrow) {
            sb.append("ObjectDescriptor(" + AbstractC1433e.ad(((Cthrow) cdefault).f36483e.f2940e) + ") " + str2);
            return;
        }
        if (!(cdefault instanceof C4148e)) {
            sb.append(cdefault.toString() + str2);
            return;
        }
        C4148e c4148e = (C4148e) cdefault;
        Cthis cthis = c4148e.f9154e;
        Ctry ctry = c4148e.f9156e;
        sb.append("External " + str2);
        String str4 = str + "    ";
        if (ctry != null) {
            StringBuilder isPro = AbstractC8703e.isPro(str4, "Direct Reference: ");
            isPro.append(ctry.m4673class());
            isPro.append(str2);
            sb.append(isPro.toString());
        }
        if (cthis != null) {
            StringBuilder isPro2 = AbstractC8703e.isPro(str4, "Indirect Reference: ");
            isPro2.append(cthis.toString());
            isPro2.append(str2);
            sb.append(isPro2.toString());
        }
        Cdefault cdefault2 = c4148e.f9153e;
        if (cdefault2 != null) {
            vip(str4, cdefault2, sb);
        }
        StringBuilder isPro3 = AbstractC8703e.isPro(str4, "Encoding: ");
        isPro3.append(c4148e.f9155e);
        isPro3.append(str2);
        sb.append(isPro3.toString());
        vip(str4, c4148e.f9152e, sb);
    }
}
