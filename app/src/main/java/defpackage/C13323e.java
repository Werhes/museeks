package defpackage;

import android.os.ConditionVariable;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13323e extends Thread {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f26576e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f26577e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26578e = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13323e(C8531e c8531e, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f26576e = c8531e;
        this.f26577e = conditionVariable;
    }

    public C13323e(C10479e c10479e) {
        super("KtorShutdownHook");
        this.f26577e = c10479e;
        this.f26576e = new AtomicBoolean(true);
    }

    public C13323e(InputStream inputStream, ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream) {
        super("MS => PFD TransferThread");
        this.f26577e = inputStream;
        this.f26576e = autoCloseOutputStream;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        int read;
        switch (this.f26578e) {
            case 0:
                if (((AtomicBoolean) this.f26576e).compareAndSet(true, false)) {
                    ((C10479e) this.f26577e).invoke();
                    return;
                }
                return;
            case 1:
                synchronized (((C8531e) this.f26576e)) {
                    ((ConditionVariable) this.f26577e).open();
                    C8531e.ad((C8531e) this.f26576e);
                    ((C8531e) this.f26576e).vip.getClass();
                }
                return;
            default:
                InputStream inputStream = (InputStream) this.f26577e;
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.f26576e;
                byte[] bArr = new byte[1024];
                while (true) {
                    try {
                        try {
                            try {
                                read = inputStream.read(bArr);
                            } catch (Throwable unused) {
                            }
                        } finally {
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        inputStream.close();
                        Unit unit = Unit.INSTANCE;
                    }
                    if (read > 0) {
                        autoCloseOutputStream.write(bArr, 0, read);
                    } else {
                        autoCloseOutputStream.flush();
                        inputStream.close();
                        Unit unit2 = Unit.INSTANCE;
                        try {
                            autoCloseOutputStream.close();
                            Unit unit3 = Unit.INSTANCE;
                        } catch (Throwable unused2) {
                            return;
                        }
                    }
                }
        }
    }
}
