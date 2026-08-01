package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045e extends C4094e {
    @Override // defpackage.C4094e
    /* renamed from: metrica, reason: merged with bridge method [inline-methods] */
    public final Intent license(Context context, Uri uri) {
        StorageManager storageManager;
        StorageVolume primaryStorageVolume;
        Intent createOpenDocumentTreeIntent;
        if (Build.VERSION.SDK_INT >= 29 && (storageManager = (StorageManager) context.getSystemService(StorageManager.class)) != null && (primaryStorageVolume = storageManager.getPrimaryStorageVolume()) != null && (createOpenDocumentTreeIntent = primaryStorageVolume.createOpenDocumentTreeIntent()) != null) {
            return createOpenDocumentTreeIntent;
        }
        Intent license = super.license(context, uri);
        license.putExtra("android.content.extra.SHOW_ADVANCED", true);
        license.putExtra("android.content.extra.FANCY", true);
        return license;
    }
}
