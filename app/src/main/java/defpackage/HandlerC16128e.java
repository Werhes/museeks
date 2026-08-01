package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import ealvatag.tag.datatype.DataTypes;
import j$.util.Objects;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC16128e extends HandlerC9134e {
    public final /* synthetic */ C5916e ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC16128e(C5916e c5916e, Looper looper) {
        super(looper);
        this.ad = c5916e;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C5916e c5916e = this.ad;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C3532e());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C3773e) {
                        c5916e.billing = (C3773e) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c5916e.purchase = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = C5916e.adcel.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        c5916e.license(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c5916e.ad) {
                        int i = 0;
                        while (true) {
                            try {
                                C17519e c17519e = c5916e.ad;
                                if (i < c17519e.f34352e) {
                                    c5916e.license((String) c17519e.purchase(i), intent2.getExtras());
                                    i++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], DataTypes.OBJ_ID)) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                c5916e.license(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
