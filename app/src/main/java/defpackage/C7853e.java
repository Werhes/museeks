package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7853e extends RuntimeException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C7812e f15900e;

    public C7853e(C7812e c7812e) {
        this.f15900e = c7812e;
        if (c7812e.vip) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = c7812e.ad;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C9350e c9350e = (C9350e) list.get(i);
            if (!AbstractC1660e.startapp(iArr, c9350e.ad)) {
                if (c9350e.ad == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((C9350e) list.get(i3)).ad == 1000) {
                        break;
                    } else {
                        AbstractC13480e.m3594package(arrayList);
                    }
                } else {
                    arrayList.add(c9350e);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((C9350e) arrayList.get(i4)).ad, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Throwable
    public final String getMessage() {
        C7812e c7812e = this.f15900e;
        if (!c7812e.vip) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        C1169e license = AbstractC6874e.license();
        C15942e c15942e = new C15942e(1, c7812e.ad);
        int subs = c15942e.subs();
        String str = null;
        String str2 = null;
        for (int i = 0; i < subs; i++) {
            C9350e c9350e = (C9350e) c15942e.get(i);
            C12344e c12344e = c9350e.vip;
            Integer num = c9350e.metrica;
            if (c12344e != null) {
                boolean z = c12344e.f24750e;
                String str3 = (String) c12344e.f24749e;
                if (str3 == null) {
                    String str4 = z ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = (String) c12344e.f24751e;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                ?? r14 = c12344e.f24753e;
                String str6 = str + '(' + str2 + ':' + ((num == null || num.intValue() >= r14.size()) ? "<unknown line>" : String.valueOf(((C9778e) r14.get(num.intValue())).ad)) + ')';
                if (!z) {
                }
                if (!AbstractC7890e.billing(str3, "rememberCompositionContext") || !AbstractC7890e.billing((String) c12344e.f24748e, "9igjgp")) {
                    license.add(str6);
                }
            }
        }
        C15942e c15942e2 = new C15942e(1, AbstractC6874e.metrica(license));
        int subs2 = c15942e2.subs();
        for (int i2 = 0; i2 < subs2; i2++) {
            String str7 = (String) c15942e2.get(i2);
            sb.append("\tat ");
            sb.append(str7);
            sb.append('\n');
        }
        return sb.toString();
    }
}
