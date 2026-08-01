package defpackage;

import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.FileAttribute;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۢؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15796e {
    public static C7576e ad(InterfaceC13021e interfaceC13021e, C17974e c17974e, C14826e c14826e, Function0 function0) {
        InterfaceC8850e interfaceC8850e = c14826e.f29359e;
        C13664e c13664e = C13664e.f27089e;
        InterfaceC5083e interfaceC5083e = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new C7576e(new C4913e(interfaceC13021e, new C6846e(10, c14826e), function0), Collections.singletonList(new C15966e(AbstractC13480e.m3584final(c13664e, c13664e), interfaceC5083e, 6)), c17974e, interfaceC8850e);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new C7576e(new C4913e(interfaceC13021e, function0), Collections.singletonList(new C15966e(AbstractC13480e.m3584final(c13664e, c13664e), interfaceC5083e, 6)), c17974e, interfaceC8850e);
        }
    }

    public static void adcel(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }

    public static void appmetrica(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void billing(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void license(File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return;
        }
        if (parentFile.exists() && !parentFile.isDirectory() && AbstractC7890e.billing(parentFile.getName(), "firebaseSessions") && !parentFile.delete()) {
            throw new IOException("Failed to delete conflicting file: " + parentFile);
        }
        if (parentFile.isDirectory()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Files.createDirectories(parentFile.toPath(), new FileAttribute[0]);
                return;
            } catch (Exception e) {
                throw new IOException("Failed to create directory: " + parentFile, e);
            }
        }
        if (parentFile.mkdirs() || parentFile.isDirectory()) {
            return;
        }
        throw new IOException("Failed to create directory: " + parentFile);
    }

    public static AutofillValue metrica(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static void purchase(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static void startapp(ViewStructure viewStructure, boolean z) {
        viewStructure.setDataIsSensitive(z);
    }

    public static AutofillValue vip(String str) {
        if (str.length() >= 5000) {
            str = (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? AbstractC5304e.m1860finally(4999, str) : AbstractC5304e.m1860finally(5000, str);
        }
        return AutofillValue.forText(str);
    }

    public static void yandex(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }
}
