package defpackage;

import android.content.Context;
import android.content.UriPermission;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٝۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2745e {
    public static final C14151e appmetrica;
    public static final C14151e license;
    public static final C14151e metrica;
    public static final C17014e ad = new C17014e(12);
    public static final C2443e vip = new C2443e("NO_THREAD_ELEMENTS", 2);

    static {
        byte b = 0;
        metrica = new C14151e(b, 20);
        license = new C14151e(b, 21);
        appmetrica = new C14151e(b, 22);
    }

    public static final void ad(C17651e c17651e, AbstractC7185e abstractC7185e) {
        if (AbstractC10558e.mopub(C16387e.f32191e, c17651e, abstractC7185e) != EnumC2821e.f6782e) {
            AbstractC10558e.startapp(abstractC7185e).billing(Unit.INSTANCE);
        }
    }

    public static final void appmetrica(InterfaceC8850e interfaceC8850e, Object obj) {
        if (obj == vip) {
            return;
        }
        if (!(obj instanceof C9799e)) {
            ((AbstractC8670e) interfaceC8850e.mo395e(null, license)).ad(obj);
            return;
        }
        C9799e c9799e = (C9799e) obj;
        AbstractC8670e[] abstractC8670eArr = c9799e.metrica;
        int length = abstractC8670eArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            abstractC8670eArr[length].ad(c9799e.vip[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C12344e license(String str) {
        String str2;
        boolean z;
        C13664e c13664e;
        String str3;
        int i;
        int i2;
        C15525e c15525e = new C15525e(str, 4, (char) 0);
        char c = '(';
        int i3 = 1;
        Throwable th = null;
        if (c15525e.appmetrica('C')) {
            c15525e.metrica++;
            if (c15525e.appmetrica('C')) {
                c15525e.metrica++;
            }
            if (c15525e.appmetrica('(')) {
                c15525e.metrica++;
                String billing = c15525e.billing(")");
                c15525e.license();
                c15525e.metrica++;
                str2 = billing;
                z = true;
            } else {
                z = true;
                str2 = null;
            }
        } else {
            str2 = null;
            z = false;
        }
        while (c15525e.metrica < str.length() - i3 && Character.isLetter(str.charAt(c15525e.metrica)) && str.charAt(c15525e.metrica + i3) == c) {
            char charAt = str.charAt(c15525e.metrica);
            if (charAt == 'N') {
                i = i3;
                c15525e.metrica += 2;
                ArrayList arrayList = new ArrayList();
                while (!c15525e.metrica() && !c15525e.appmetrica(')')) {
                    c15525e.billing(":,)");
                    if (c15525e.appmetrica(':')) {
                        c15525e.metrica++;
                        AbstractC6507e.remoteconfig(c15525e.billing(",)"), "c#", "androidx.compose.");
                    }
                    arrayList.add(new C1025e(arrayList.size()));
                    if (c15525e.appmetrica(',')) {
                        c15525e.metrica++;
                    }
                }
                c15525e.license();
                c15525e.metrica++;
            } else if (charAt != 'P') {
                c15525e.metrica += 2;
                int i4 = 0;
                while (true) {
                    if (i4 <= 0 && c15525e.appmetrica(')')) {
                        c15525e.license();
                        c15525e.metrica += i3;
                        break;
                    }
                    if (c15525e.metrica()) {
                        c15525e.startapp("unexpected end");
                        throw th;
                    }
                    if (c15525e.appmetrica(c)) {
                        i4++;
                    } else if (c15525e.appmetrica(')')) {
                        i4--;
                    }
                    c15525e.metrica += i3;
                }
            } else {
                c15525e.metrica += 2;
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                while (!c15525e.metrica() && !c15525e.appmetrica(')')) {
                    if (c15525e.appmetrica('!')) {
                        c15525e.metrica += i3;
                        String billing2 = c15525e.billing("!,)");
                        if (billing2.length() != 0) {
                            int parseInt = Integer.parseInt(billing2);
                            int i6 = 0;
                            while (true) {
                                i2 = i3;
                                if (parseInt <= 0) {
                                    break;
                                }
                                int size = arrayList2.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= size) {
                                        arrayList2.add(new C1025e(i6));
                                        parseInt--;
                                        break;
                                    }
                                    if (((C1025e) arrayList2.get(i7)).ad == i6) {
                                        i6++;
                                        break;
                                    }
                                    i7++;
                                }
                                i3 = i2;
                            }
                        } else {
                            i5 = i3;
                            i2 = i5;
                        }
                    } else {
                        i2 = i3;
                        int purchase = c15525e.purchase("!:,)");
                        if (c15525e.appmetrica(':')) {
                            c15525e.metrica++;
                            AbstractC6507e.remoteconfig(c15525e.billing("!,)"), "c#", "androidx.compose.");
                        }
                        if (i5 != 0) {
                            int i8 = 0;
                            while (i8 < purchase) {
                                int size2 = arrayList2.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= size2) {
                                        arrayList2.add(new C1025e(i8));
                                        break;
                                    }
                                    if (((C1025e) arrayList2.get(i9)).ad == i8) {
                                        i8++;
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            i5 = 0;
                        }
                        arrayList2.add(new C1025e(purchase));
                    }
                    if (c15525e.appmetrica(',')) {
                        c15525e.metrica++;
                    }
                    i3 = i2;
                }
                i = i3;
                c15525e.license();
                c15525e.metrica++;
            }
            i3 = i;
            c = '(';
            th = null;
        }
        if (c15525e.appmetrica(':')) {
            c15525e.metrica++;
            c13664e = C13664e.f27089e;
        } else {
            ArrayList arrayList3 = new ArrayList();
            while (!c15525e.metrica() && !c15525e.appmetrica(':')) {
                if (c15525e.appmetrica('*')) {
                    c15525e.metrica++;
                }
                Integer valueOf = !c15525e.appmetrica('@') ? Integer.valueOf(c15525e.purchase("@") + 1) : null;
                c15525e.metrica++;
                c15525e.purchase("L,:");
                if (c15525e.appmetrica('L')) {
                    c15525e.metrica++;
                    c15525e.purchase(",:");
                }
                arrayList3.add(new C9778e(valueOf != null ? valueOf.intValue() : -1));
                if (c15525e.appmetrica(',')) {
                    c15525e.metrica++;
                }
            }
            c15525e.metrica++;
            c13664e = arrayList3;
        }
        C13664e c13664e2 = c13664e;
        String billing3 = c15525e.billing("#");
        String str4 = billing3.length() > 0 ? billing3 : null;
        if (c15525e.appmetrica('#')) {
            int i10 = c15525e.metrica + 1;
            c15525e.metrica = i10;
            str3 = str.substring(i10, str.length());
        } else {
            str3 = null;
        }
        return new C12344e(str2, str4, str3, c13664e2, z);
    }

    public static final File metrica(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final Object purchase(InterfaceC8850e interfaceC8850e, Object obj) {
        if (obj == null) {
            obj = interfaceC8850e.mo395e(0, metrica);
        }
        return obj == 0 ? vip : obj instanceof Integer ? interfaceC8850e.mo395e(new C9799e(((Number) obj).intValue(), interfaceC8850e), appmetrica) : ((AbstractC8670e) obj).vip(interfaceC8850e);
    }

    public static void vip(Context context, Function0 function0) {
        Object c12763e;
        String ad2 = C5775e.ad.ad();
        if (!AbstractC7890e.billing(ad2, BuildConfig.FLAVOR)) {
            List<UriPermission> persistedUriPermissions = context.getContentResolver().getPersistedUriPermissions();
            if (!persistedUriPermissions.isEmpty() && !persistedUriPermissions.isEmpty()) {
                for (UriPermission uriPermission : persistedUriPermissions) {
                    if (AbstractC7890e.billing(uriPermission.getUri().toString(), ad2) || !uriPermission.isWritePermission()) {
                        try {
                            Uri parse = Uri.parse(ad2);
                            c12763e = new C1832e(null, context, DocumentsContract.buildDocumentUriUsingTree(parse, DocumentsContract.getTreeDocumentId(parse)));
                        } catch (Throwable th) {
                            c12763e = new C12763e(th);
                        }
                        if (C13523e.ad(c12763e) != null) {
                            C5775e.ad.metrica(BuildConfig.FLAVOR);
                        } else {
                            C1832e c1832e = (C1832e) (c12763e instanceof C12763e ? null : c12763e);
                            if (c1832e != null) {
                                if (c1832e.ad()) {
                                    AppActivity appActivity = (AppActivity) context;
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        appActivity.premium(Collections.singletonList("android.permission.POST_NOTIFICATIONS"), new C6868e(function0, appActivity, 1));
                                        return;
                                    } else {
                                        function0.invoke();
                                        return;
                                    }
                                }
                                C5775e.ad.metrica(BuildConfig.FLAVOR);
                            }
                        }
                    }
                }
            }
            C5775e.ad.metrica(BuildConfig.FLAVOR);
        }
        AbstractC15615e.ad(new Celse(context, new C15076e(Integer.valueOf(R.drawable.ic_folder_outline_24), context.getString(R.string.path_select_none), context.getString(R.string.path_select_text), new C6571e(context.getString(R.string.path_select_button), new C14648e(context, 3)), null, 48), 4));
    }
}
