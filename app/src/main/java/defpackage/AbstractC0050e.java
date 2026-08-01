package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؑؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0050e {
    public static final C4662e ad = new C4662e(2);
    public static final C6575e vip = new C6575e(14);

    public static C6233e ad(Context context, List list) {
        String str;
        Typeface metrica;
        Trace.beginSection("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                C10359e c10359e = (C10359e) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (metrica = AbstractC17174e.metrica((str = c10359e.appmetrica))) == null || AbstractC17174e.license(metrica) == null) {
                    ProviderInfo vip2 = vip(context.getPackageManager(), c10359e, context.getResources());
                    if (vip2 == null) {
                        return new C6233e();
                    }
                    arrayList.add(metrica(context, c10359e, vip2.authority));
                } else {
                    arrayList.add(new C14959e[]{new C14959e(str, c10359e.purchase)});
                }
            }
            return new C6233e(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, eٍؘٖ] */
    public static C14959e[] metrica(Context context, C10359e c10359e, String str) {
        C7988e c7988e;
        ArrayList arrayList;
        Uri withAppendedId;
        Trace.beginSection("FontProvider.query");
        try {
            ArrayList arrayList2 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            if (Build.VERSION.SDK_INT < 24) {
                c7988e = new C7988e(context, build);
            } else {
                ?? obj = new Object();
                obj.f31681e = context.getContentResolver().acquireUnstableContentProviderClient(build);
                c7988e = obj;
            }
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection("ContentQueryWrapper.query");
                try {
                    cursor = c7988e.adcel(build, strArr, new String[]{c10359e.metrica});
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            int i = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                            int i2 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                arrayList = arrayList3;
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                arrayList = arrayList3;
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            ArrayList arrayList4 = arrayList;
                            arrayList4.add(new C14959e(withAppendedId, i2, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, c10359e.purchase, i));
                            arrayList3 = arrayList4;
                        }
                        arrayList2 = arrayList3;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    c7988e.close();
                    return (C14959e[]) arrayList2.toArray(new C14959e[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                c7988e.close();
                throw th;
            }
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, eؗۨ۟] */
    public static ProviderInfo vip(PackageManager packageManager, C10359e c10359e, Resources resources) {
        C6575e c6575e = vip;
        C4662e c4662e = ad;
        Trace.beginSection("FontProvider.getProvider");
        try {
            List list = c10359e.license;
            String str = c10359e.ad;
            String str2 = c10359e.vip;
            if (list == null) {
                list = AbstractC16279e.mopub(resources, 0);
            }
            ?? obj = new Object();
            obj.ad = str;
            obj.vip = str2;
            obj.metrica = list;
            ProviderInfo providerInfo = (ProviderInfo) c4662e.vip(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!resolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c6575e);
            for (int i = 0; i < list.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                Collections.sort(arrayList2, c6575e);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    c4662e.metrica(obj, resolveContentProvider);
                    return resolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }
}
