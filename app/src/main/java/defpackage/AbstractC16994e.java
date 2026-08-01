package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16994e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33298e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2892e f33296e = new C2892e(-1022579475, false, new C11049e(17));

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C2892e f33295e = new C2892e(844097764, false, new C0972e(17));

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2892e f33297e = new C2892e(712214648, false, new C11049e(18));

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C2892e f33294e = new C2892e(1086138917, false, new C11049e(19));

    public /* synthetic */ AbstractC16994e(int i) {
        this.f33298e = i;
    }

    public static File adcel(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer advert(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static boolean appmetrica(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static boolean license(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean appmetrica = appmetrica(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return appmetrica;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static final boolean mopub(AbstractC16904e abstractC16904e, float f) {
        abstractC16904e.mopub().getClass();
        return !(((abstractC16904e.admob() ? -f : yandex(abstractC16904e)) > 0.0f ? 1 : ((abstractC16904e.admob() ? -f : yandex(abstractC16904e)) == 0.0f ? 0 : -1)) > 0);
    }

    public static final float yandex(AbstractC16904e abstractC16904e) {
        return abstractC16904e.mopub().appmetrica == EnumC17426e.f34145e ? Float.intBitsToFloat((int) (abstractC16904e.Signature() >> 32)) : Float.intBitsToFloat((int) (abstractC16904e.Signature() & 4294967295L));
    }

    public abstract ImageView amazon(InterfaceC10283e interfaceC10283e);

    public abstract Object billing();

    public abstract void metrica(InterfaceC10283e interfaceC10283e, AudioTrack audioTrack, int i);

    public abstract InterfaceC10283e purchase(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract void smaato(InterfaceC10283e interfaceC10283e);

    public abstract int startapp();

    public String toString() {
        switch (this.f33298e) {
            case 3:
                return billing().toString();
            default:
                return super.toString();
        }
    }

    public void vip(InterfaceC10283e interfaceC10283e, boolean z) {
    }
}
